let element = document
    .querySelector("#fruit");
    //.querySelector("#vegetables");
    //.querySelector("#dessert");

let select;

//select = element.firstElementChild;
//select = element.lastElementChild;

//select = element.parentElement;

//select = element.nextElementSibling;
//select = element.previousElementSibling;

select = element.children[1];
selects = Array.from(element.children);

console.log(select);

select.style.backgroundColor = "lightgreen";

selects.forEach(s => s.style.backgroundColor = "lightblue");