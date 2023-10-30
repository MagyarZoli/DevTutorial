let grade = "Pizza";

switch (grade) {
    case "A" :
        console.log("You did great!");
        break;
    case "B" :
        console.log("You did good!");
        break;
    case "C" :
        console.log("You did okay!");
        break;
    case "D" :
        console.log("You passed ... barely");
        break;
    case "F" :
        console.log("You FAILED!");
        break;
    default:
        console.log(grade, "is not a letter grade!");
}

let point = 75;

switch (true) {
    case point >= 90 :
        console.log("You did great!");
        break;
    case point >= 80 :
        console.log("You did good!");
        break;
    case point >= 70 :
        console.log("You did okay!");
        break;
    case point >= 60 :
        console.log("You passed ... barely");
        break;
    case point > 60 :
        console.log("You FAILED!");
        break;
    default:
        console.log(grade, "is not a letter grade!");
}