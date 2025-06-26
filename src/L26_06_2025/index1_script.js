document.addEventListener("DOMContentLoaded",
 () => {console.log("DOM полностью загружен")
const mainHeader = document.getElementById('mainHeader');
const mainText = document.getElementById('mainText');
const userInput = document.getElementById('userInput');
const changeTextBtn = document.getElementById('changeTextBtn');
const addListItemBtn = document.getElementById('addListItemBtn');
const highlightHeaderBtn = document.getElementById('highlightHeaderBtn');
const removeLastItemBtn = document.getElementById('removeLastItemBtn');
const itemList = document.getElementById('itemList');

changeTextBtn.addEventListener('click', () => {
    const inputValue = userInput.value;
    mainText.textContent = inputValue ? inputValue : 'Введите текст в поле!'
})
addListItemBtn.addEventListener('click', () => {
    const newItem = document.createElement('li'); // создание элемента
    newItem.textContent = `Элемент ${itemList.children.length + 1}`;
    itemList.appendChild(newItem);// добавили элемент
})
highlightHeaderBtn.addEventListener('click', () =>{
    mainHeader.classList.toggle('highlight');// создание класса
})//подсветка заголовка

removeLastItemBtn.addEventListener('click', ()=>{
    if(itemList.lastChild){ // проверили есть ли последний эл, если да - то true
itemList.removeChild(itemList.lastChild); //удалил последний элемент
    }
})
mainHeader.addEventListener('mouseover', ()=>{// меняет цвет при наведении мышкой
    mainHeader.style.color = "green";})

    mainHeader.addEventListener('mouseout', ()=>{
        mainHeader.style.color = "black";}) // возвращает обратно цвет при отводе мыши


    })