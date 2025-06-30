document.addEventListener("DOMContentLoaded",
 () => {console.log("DOM полностью загружен")
 
 const ajax = document.getElementById('ajax');
 const ajax2 = document.getElementById('ajax2');
 const ajax3 = document.getElementById('ajax3');
 const ajax4 = document.getElementById('ajax4');
 const url = 'https://jsonplaceholder.typicode.com/posts/1';
 const url2 = 'https://jsonplaceholder.typicode.com/posts';
ajax.addEventListener('click', ()=>{
    const xhr = new XMLHttpRequest(); //старый способ ajax
    xhr.open('GET', url, true);
    xhr.onreadystatechange = function (){
        if(xhr.readyState === 4 && xhr.status === 200){
            const post = JSON.parse(xhr.responseText);
            console.log(post);
            const p = document.createElement('p');
            p.textContent = post.title;
            document.body.appendChild(p);
        }
    };
    xhr.send();
})
//FETCH
/* ajax2.addEventListener('click', ()=>{
    fetch(url).then(response => {
        if(!response.ok) throw new Error ('Ошибка сети');
        return response.json();
    }).then(date => console.log(date))
    .catch(error => console.error(error));
 })*/

 //асинхронный метод GET
 ajax3.addEventListener('click', ()=>{
getPost();
 })
 async function getPost() {
    try{
        const response = await fetch(url); // ожидай выполнение 
        if(!response.ok) throw new Error ('Ошибка сети');
        const date = await response.json();
        console.log(date);
    }
    catch (error){
        console.error(error);
    }
 }

 //асинхронный метод POST
 ajax4.addEventListener('click', ()=>{
    postPost();
 })
 async function postPost() {
    try{
        const response = await fetch(url2,{method: 'POST',
        headers:{'Content-Type' : 'application/json'},
        body: JSON.stringify({
        title:'Новый пост', 
        body: 'Содержимое',
        userID: 1})
    });
        if(!response.ok) throw new Error ('Ошибка сети');
        const date = await response.json();
        console.log(date);
    }
    catch (error){
        console.error(error);
    }
 }

 });
