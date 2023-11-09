let hello = "Hello World from Node.js";
console.log(hello);

const path = require("path");
console.log(__dirname);
console.log(__filename);
console.log(`The file name is ${path.basename(__filename)}`);

console.log();
for (let key in global) {
    console.log(key);
}