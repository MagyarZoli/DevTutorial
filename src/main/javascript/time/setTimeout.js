let timer1 = setTimeout(firstMessage, 3000);
let timer2 = setTimeout(secondMessage, 6000);
let timer3 = setTimeout(thirdMessage, 9000);

function firstMessage() {
    alert(`Buy this course for $500!`);
}

function secondMessage() {
    alert(`This is not a scam!`);
}

function thirdMessage() {
    alert(`DO ITT!`);
}

document.getElementById("button").onclick = () => {
    clearTimeout(timer1);
    clearTimeout(timer2);
    clearTimeout(timer3);
    alert(`Thanks for buying`);
}