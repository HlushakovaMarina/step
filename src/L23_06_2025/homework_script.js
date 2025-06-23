// 1
let student = {
    name: "Иван",
    age: 20,
    grope: "ПИ-101"
}
console.log(student);

// 2
let car = {
    brand: "Toyota",
    model: "Corolla",
    year: 2020
  };
  car.year = 2022;
  car.color = "синий";
  console.log(car);

// 3
function countProperties(obj) {
    let i = 0;
    for(keu in obj){
        i++;
    }
    return i;

}
let length =  countProperties(car);
console.log(length);

// 4
let n =5;
for( let i=1; i<=n; i++){
    console.log(i);
}

//5 
let nums = [10, 20, 30, 40,50];
for()

//6
let fruits = ["яблоко", "банан", "апельсин", "груша"];
for(let i=0; i< length; i++){
    if(fruits[i] === "апельсин"){
        console.log(i);
    }
}
    
