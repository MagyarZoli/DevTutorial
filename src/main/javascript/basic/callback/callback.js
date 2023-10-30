// let total = sum(2, 3);
// displayConsole(total);
//
// function sum(x, y) {
//     return x + y;
// }

sum(2, 3, displayConsole);

function sum(x, y, callback) {
    callback(x + y);
}

function displayConsole(output) {
    console.log(output);
}