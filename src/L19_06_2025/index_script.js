//Комент
let message='Текст';
let a = 5;
let b = 2.2;
let c = true;

var g = 'Старый браузер';

const mess = 'Неизменяемая переменная';
console.log(mess);

c = String(c);

let y = '23';
y = Number(y);
console.log(Number(true));


let n = Boolean(1);
console.log(n);

console.log(typeof 5);

console.log(typeof "difhi");

a++;

let age = 33;
if(age === 32) {
    alert('Мне ' + age);
}else if(age===33){
    console.log('Угадал');
}
else{
    console.log('Не угадал');
}

age > 30 ? console.log('Больше') : console.log('Меньше');

age !== 50;

let i = 5;
while(i<10){
    console.log('Итерация'+ i);
    i++;
}

for(let i = 0; i < 3; i++){
    console.log('FOR'+ i);
    if(i == 1){
        break;
    }
}

switch (i) {
    case 1:
        console.log('Один');
        break;
        case 2:
            console.log('Два');
            break;
            default:
                console.log('Другое');
}

function showMyAge() {
    console.log(age);
}
showMyAge();
for(let i = 0; i < 10; i++){
showMyAge();
}
function showMyAge(k = 12) {
    console.log(k);
}
showMyAge();

function sum(a, b){
    return a + b;
}
let mySum = sum(2,5);

function ijh(a, b) {
    return a**b;
}
let myIjh = ijh(2, 5);
console.log(myIjh); 

let sum2 = (a, b) => a + b;

let sayHi = () => alert = ("Привет"); //стрелочная функция, у нее нет this
sayHi;

//создание объекта
let user = new Object();
let user2 = {}; // тоже что и первый
let user3 = {
    name: "Марина",
    age: "32",
    email: "truhina_m@mail.ru", "likes play pc games": true
}
console.log(user3);
//добавление нового свойства 
let userName = user3.name;
user3.lastName = "Глушакова";

console.log(user3);

let play = user3 ["likes play pc games"];
user3["name"];

user3["like sleep"] = true;
console.log(user3);

if(user3.adress === undefined) {

}
// проверка, есть ли в юзере такое-то свойство
if("adress" in user3){

}
// как получить все свойства объекта
for(key in user3){
    console.log(key);// только ключи, без значений
    console.log(user3[key]);// ключи со значением
}
let user4 = user3;//ссылка на тот же объект
user3.age = 50;
console.log(user4);
console.log(user3);

user3 === user4; // true

let user5 = {};
let user6 = {};

user5 === user6 // false

let user7 = {}; // клонирование объекта user3 в user7
for(key in user3){
  user7[key] = user3[key];
}
let user8 = {};
Object.assign(user8, user3);// клонировал все свойства user3
let user9 = Object.assign({}, user3);// клонировал все свойства user3, 
//как две строчки выше

delete user3["likes play pc games"];// как удалить свойство из объекта

user3.adress = {
    city: "Витебск",
    street: {
        house: 12,
        lable: "Fun street"
    }// вложенный оюъект в объекте  
}

for(key in user3){
   console.log(key);
   let u = user3[key];
   if(typeof u === "object"){
   for(key2 in u){
    console.log(key2);
    let u2 = u[key2];
    if(typeof u2 === "object"){
        for(key3 in u2){
            console.log(key3);
    }
   }
   }
}
}

let user10 = {
    name: "Kris",
    age: 37,
    sayHi(){
        alert("Привет, меня зовут " + this.name)
    }
}
//user10.sayHi();

function User12(name, age){//конструктор 
    this.name = name;
    this.age = age;
    this.sayHi = function() {
        alert("Меня зовут " + this.name);
    }
}
let user12 = new User12("Марина", 32);

// примитивы
let str = "Привет";// Примитивы
console.log(str.toUpperCase());

let num  = 1.35654;
console.log(num.toFixed(2));

//миссивы
let arr = new Array();
let arr2 = ["Яблоко", "Банан"];
arr2[2] = "Слива";
arr2.length; //длина массива
arr[3] = () => alert("Привет");
arr2.push("Гранат");// добавляет в конец списка
arr2.pop();//удаляет последний элемент
arr2.shift();// удаляет первый эл-т
arr2.unshift("Груша");// добавляет в начало массива, первым элементом
for(let fruit of arr2){
    console.log(fruit);
}
