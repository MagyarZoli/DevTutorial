let element = document.getElementById("title");
element.style.backgroundColor = "lightgreen";

let fruits = document.getElementById("fruits");
console.log(fruits);
console.log(fruits[1]);
fruits.forEach(fruit => {
    if (fruit.checked) console.log(fruit.value);
});

let vegetables = document.getElementsByTagName("li");
vegetables[1].style.backgroundColor = "lightgreen";

let desserts = document.getElementsByClassName("desserts");
desserts[0].style.backgroundColor = "lightgreen";

let id = document.querySelector("#title");
let clazz = document.querySelector(".desserts");
let tag = document.querySelector("li");
let attribute = document.querySelector("[for]");

let ids = document.querySelectorAll("#title");
let clazzes = document.querySelectorAll(".desserts");
let tags = document.querySelectorAll("li");
let attributes = document.querySelectorAll("[for]");