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
let n = 5;
for(let i = 1; i <= n; i++){
    console.log(i);
}

//5 
let numbers = [10, 20, 30, 40,50];
let sum = 0;
for(let i = 0; i < numbers.length; i++){
sum += numbers[i];
}
console.log("Сумма: ", sum);

//6
let fruits = ["яблоко", "банан", "апельсин", "груша"];
for(let i = 0; i < fruits.length; i++){
    if(fruits[i] === "апельсин"){
        console.log(i);
        break;
    }
}

// 7
let book = {
  title: "JavaScript для начинающих",
  author: "Иван Петров",
  pages: 200,
  price: 1500
};
for (let key in book) {
    console.log(key + ": " + book[key]);
  }

  // 8 
  let students = [
  { name: "Алексей", age: 20, group: "ПИ-101" },
  { name: "Мария", age: 19, group: "ПИ-102" },
  { name: "Иван", age: 21, group: "ПИ-101" }
];
for(let i = 0; i < students.length; i++){
if(students[i].group === "ПИ-101"){
  console.log(students[i].name);
}
}

// 9
let products = {
  "ноутбук": 60000,
  "телефон": 30000,
  "наушники": 8000,
  "мышь": 2000
};
let maxPrice = 0;
let mostExpensiveProduct = "";
for (let product in products) {
    if (products[product] > maxPrice) {
      maxPrice = products[product];
      mostExpensiveProduct = product;
    }
  }
console.log("Самый дорогой товар: " + mostExpensiveProduct + " (" + maxPrice + ")");
