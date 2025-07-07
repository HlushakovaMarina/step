document.addEventListener("DOMContentLoaded",
 () => {console.log("DOM полностью загружен")
 const loadPhotosBtn = document.getElementById('loadPhotosBtn');
 const gallery = document.getElementById('gallery');
 const output = document.getElementById('output');
 const clearGalleryBtn = document.createElement('button');
 clearGalleryBtn.textContent = 'Очистить галерею';
 loadPhotosBtn.parentNode.insertBefore(clearGalleryBtn, loadPhotosBtn.nextSibling);


let albumIdInput;
let prevBtn;
let nextBtn;
let start = 0;

 function createAlbumIdInput() {
    albumIdInput = document.createElement('input');
    albumIdInput.type = 'number';
    albumIdInput.placeholder = 'ID альбома (1-100)';
    albumIdInput.min = 1;
    albumIdInput.max = 100;
    loadPhotosBtn.parentNode.insertBefore(albumIdInput, loadPhotosBtn);
  }

function createPaginationButtons() {
    prevBtn = document.createElement('button');
    prevBtn.textContent = 'Предыдущая страница';
    nextBtn = document.createElement('button');
    nextBtn.textContent = 'Следующая страница';

    loadPhotosBtn.parentNode.insertBefore(prevBtn, loadPhotosBtn);
    loadPhotosBtn.parentNode.insertBefore(nextBtn, loadPhotosBtn.nextSibling);

    prevBtn.addEventListener('click', () => {
      start = Math.max(0, start - 10);
      loadPhotos();
    });

    nextBtn.addEventListener('click', () => {
      start += 10;
      loadPhotos();
    });
  }

loadPhotosBtn.addEventListener('click', ()=>{
    fetch(url).then(response => {
        if(!response.ok) throw new Error ('Ошибка сети');
        return response.json();
    }).then(date => console.log(date))
    .catch(error => console.error(error));
 })

 loadPhotosBtn.addEventListener('click', ()=>{
    getPost();
     })
     async function getPost() {
      output.textContent = '';
         let url = 'https://jsonplaceholder.typicode.com/photos?_limit=10';

         if (albumIdInput && albumIdInput.value) {
           const albumId = parseInt(albumIdInput.value);
           if (albumId >= 1 && albumId <= 100) {
             url = `https://jsonplaceholder.typicode.com/albums/${albumId}/photos?_limit=10`;
           } else {
             output.textContent = 'Неверный ID альбома (1-100)';
             return;
           }
         }

         if (prevBtn && nextBtn) {
           url = `${url}&_start=${start}`;
         }
        try{
            const response = await fetch(url); // ожидай выполнение 
            if(!response.ok) throw new Error ('Ошибка сети');
            const date = await response.json();
            console.log(date);
            for(const card of date){
        const div = document.createElement('div');
        div.setAttribute('class', 'photo-card');
        const img = document.createElement('img');
        img.setAttribute('src', card.thumbnailUrl);
        const p = document.createElement('p');
        p.textContent=card.title;
    div.appendChild(img);
    div.appendChild(p);
    gallery.appendChild(div);
    }
    }
        catch (error){
            console.error(error);
        }
     }
     gallery.addEventListener('click', (event) => {
         if (event.target.tagName === 'IMG') {
           const img = event.target;
           const currentSrc = img.src;
           const fullsizeUrl = img.dataset.fullsize;

           if (currentSrc === img.dataset.fullsize) {
             img.src = img.alt;
             img.dataset.fullsize = img.src;
             img.alt = currentSrc;
           } else {
             img.alt = img.src;
             img.src = fullsizeUrl;
             img.dataset.fullsize = img.src;
           }
         }
       });

clearGalleryBtn.addEventListener('click', () => {
      gallery.innerHTML = '';
      output.textContent = '';
    });

    createAlbumIdInput();
    createPaginationButtons();
    });