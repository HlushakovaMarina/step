document.addEventListener("DOMContentLoaded",
 () => {console.log("DOM полностью загружен")

const contactBtn = document.getElementById('contactBtn');
  const increaseAgeBtn = document.getElementById('increaseAgeBtn');
  const resetAgeBtn = document.getElementById('resetAgeBtn');
  const addHobbyBtn = document.getElementById('addHobbyBtn');
  const newHobbyInput = document.getElementById('newHobby');
  const nameHeader = document.querySelector('h1');
  const ageElement = document.querySelector('li'); // Находим первый li, предполагая, что это возраст
  const hobbyList = document.querySelector('ul');

// 2.Обработка клика по кнопке "Связаться"
  contactBtn.addEventListener('click', () => {
    alert('Отправить письмо на anna.ivanova@example.com?');
  });

   // Обработка клика по кнопке "Увеличить возраст"
  increaseAgeBtn.addEventListener('click', () => {
    let currentAge = parseInt(ageElement.textContent.split(': ')[1].split(' ')[0]);
    ageElement.textContent = `Возраст: ${currentAge + 1} лет`;
  });

  // Обработка клика по кнопке "Сбросить возраст"
  resetAgeBtn.addEventListener('click', () => {
    ageElement.textContent = 'Возраст: 32 лет';
  });

  // Обработка клика по кнопке "Добавить хобби"
  addHobbyBtn.addEventListener('click', () => {
    const hobbyText = newHobbyInput.value.trim();
    if (hobbyText === '') {
      alert('Введите хобби!');
      return;
    }

    const newHobbyLi = document.createElement('li');
    newHobbyLi.textContent = `Хобби: ${hobbyText}`;
    hobbyList.appendChild(newHobbyLi);
    newHobbyInput.value = ''; // Очищаем поле ввода
  });

  // Стилизация при наведении на заголовок
  nameHeader.addEventListener('mouseover', () => {
    nameHeader.style.color = 'pink';
  });

  nameHeader.addEventListener('mouseout', () => {
    nameHeader.style.color = '';
  });

  // Подсветка элементов списка при клике (бонус)
  hobbyList.addEventListener('click', (event) => {
      if (event.target.tagName === 'LI') {
          // Убираем подсветку со всех элементов списка
          hobbyList.querySelectorAll('li').forEach(li => {
              li.classList.remove('highlight');
          });

          // Подсвечиваем текущий элемент
          event.target.classList.add('highlight');
      }
  });
})