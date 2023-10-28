// sayHello();
//
// function sayHello() {
//     console.log("Hello!");
// }

const greeting = function() {
    console.log("Hello!");
}

const greeting2 = () => console.log("Hello!");


greeting();
greeting2();

const greeting3 = function (userName) {
    console.log(`Hello ${userName}`);
}

const greeting4 = (userName) => console.log(`Hello ${userName}`);

greeting3("Bro");
greeting4("Bro")
