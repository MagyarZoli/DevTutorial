let age = window.prompt("How old are you?");

console.log(typeof age);
age = Number(age);
console.log(typeof age);

age += 1;

console.log("Happy Birthday! Your are", age, "years old");

let x, y, z;

x = Number("3.14");
y = String(3.14);
z = Boolean("");

console.log(x, typeof x);
console.log(y, typeof y);
console.log(z, typeof z);
