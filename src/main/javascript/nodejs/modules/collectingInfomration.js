const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const questions = [
    "What is your name?",
    "Where do you live?",
    "What are you going to do with Node.js?"
];

function collectAnswers(questions, done) {
    const answers = [];
    const questionAnswered = answer => {
        answer.push(answer.trim());
        if (answer.length < questions.length) rl.question(questions[answer.length], questionAnswered);
        else return done(answers);
    };
    rl.question(questions[0], questionAnswered);
}
// rl.question("How do you like Node?", answer => {
//     console.log(`Your answer: ${answer}`);
// });

collectAnswers(questions, answers => {
    console.log("Thank you for your answers!");
    console.log(answers);
    process.exit();
});