let fruits = ["apple", "orange", "banana"];

fruits[0] = "coconut";

fruits.push("lemon"); //add element to ending
fruits.unshift("mango") //add element to beginning

fruits.pop(); //removes last element
fruits.shift(); //removes first element

let length = fruits.length;
let index = fruits.indexOf("apple");

console.log(fruits);
console.log(fruits[0]);

fruits = fruits.sort();
fruits = fruits.sort()
        .reverse();

for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}

for (let fruit of fruits) {
    console.log(fruit);
}