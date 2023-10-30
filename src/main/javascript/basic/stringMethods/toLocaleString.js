let num = 123456.789;

console.log(num.toLocaleString("en-US"));
console.log(num.toLocaleString("hi-IN"));

console.log(num.toLocaleString("en-US", {style: "currency", currency: "USD"}));
console.log(num.toLocaleString("hi-IN", {
    style: "currency",
    currency: "INR"
}));

console.log(num.toLocaleString(undefined, {style: "percent"}));
console.log(num.toLocaleString(undefined, {
    style: "percent"
}));

console.log(num.toLocaleString(undefined, {style: "unit", unit: "celsius"}));
console.log(num.toLocaleString(undefined, {
    style: "unit",
    unit: "celsius"
}));