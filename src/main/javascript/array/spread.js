let name = "Bro Code";
let numbers = [1,2,3,4,5,6,7,8,9];
let maximum = Math.max(...numbers);

console.log(...name);
console.log(...numbers);
console.log(maximum);

let a = 1, b = 2, c = 3, d = 4, e = 5;

console.log(sum(a, b));

function sum(...numbers) {
    let total = 0;
    for (let number of numbers) {
        total += number;
    }
    return total;
}