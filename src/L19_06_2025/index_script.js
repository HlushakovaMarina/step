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