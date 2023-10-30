// const button = document.getElementById("button");
// button.onclick = doSomething;

// const body = document.body;
// body.onload = doSomething;

// const text = document.getElementById("text");
// text.onchange = doSomething;

const div = document.getElementById("div");
// div.onmouseover = red;
// div.onmouseout = blue;
div.onmousedown = red;
div.onmouseup = blue;

function doSomething() {
    alert("You did something");
}

function red() {
    div.style.backgroundColor = "red";
}

function blue() {
    div.style.backgroundColor = "blue";
}
