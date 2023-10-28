let students = ["spongebob", "patrick", "squidward"];

students.forEach(capitalize);
console.log(students[0]);

students.forEach(print);

function capitalize(element, index, array) {
    array[index] = element[0].toUpperCase() + element.substring(1);
}

function print(element) {
    console.log(element);
}