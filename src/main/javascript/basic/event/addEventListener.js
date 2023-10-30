const innerDiv = document.getElementById("innerDiv");
const outerDiv = document.getElementById("outerDiv");

// innerDiv.addEventListener("mouseover", changeRed);
// innerDiv.addEventListener("mouseout", changeGreen);

innerDiv.addEventListener("click", changeBlue);
outerDiv.addEventListener("click", changeBlue, true);

function changeRed() {
    innerDiv.style.backgroundColor = "red";
}

function changeGreen() {
    innerDiv.style.backgroundColor = "lightgreen";
}

function changeBlue() {
    alert(`You selected $@this.id}`)
    this.style.backgroundColor = "lightblue";
}