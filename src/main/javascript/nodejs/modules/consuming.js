const readline = require("readline");
const {EventEmitter} = require("events");

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
    const [firstQuestion] = questions;

    const emitter = new EventEmitter();

    const questionAnswered = answer => {
        emitter.emit("answer", answer);

        answer.push(answer.trim());
        if (answer.length < questions.length) rl.question(questions[answer.length], questionAnswered);
        else return done(answers);
    };
    rl.question(firstQuestion, questionAnswered);
    return emitter;
}

const answerEvents = collectAnswers(questions, answers => {
    console.log("Thank you for your answers!");
    console.log(answers);
    process.exit();
});

answerEvents.on("answer", answer => console.log(`The answer is ${answer}`));