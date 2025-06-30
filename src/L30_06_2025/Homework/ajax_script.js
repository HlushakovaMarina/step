document.addEventListener("DOMContentLoaded",
 () => {console.log("DOM полностью загружен")
 const loadPhotosBtn = document.getElementById('loadPhotosBtn');
 const gallery = document.getElementById('gallery');
 const output = document.getElementById('output');
const url = 'https://jsonplaceholder.typicode.com/photos?_limit=10';

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
})