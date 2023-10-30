let date = new Date();
//let date = new Date(0);
//let date = new Date(2023, 0,1,2,3,4,5);
//let date = new Date("January 1, 2023 00:00:00");

date = date.toLocaleDateString();

console.log(date);

date.setFullYear(2024);
date.setMonth(11);
date.setDate(31);

console.log(date.getDate()); //day of mouth
console.log(date.getDay()); //day of week

console.log(date.getFullYear());
console.log(date.getMonth());
console.log(date.getHours());
console.log(date.getMinutes());

console.log(formatDate(date));

function formatDate(date) {
    let year = date.getFullYear();
    let month = date.getMonth();
    let day = date.getDate();
    return `${month}/${day}/${year}`;
}