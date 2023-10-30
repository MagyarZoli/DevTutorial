let userName = "Bro";
let age = 21;

happyBirthday();
startProgram()

function happyBirthday() {
    console.log("Happy birthday to you!");
    console.log("Happy birthday dear", userName);
    console.log("You are", age, "years old!");
}

function startProgram() {
    let userName2 = "Bro2";
    let age2 = 22;
    happyBirthday2(userName2, age2);
}

function happyBirthday2(userName, age) {
    console.log("Happy birthday to you!");
    console.log("Happy birthday dear", userName);
    console.log("You are", age, "years old!");
}