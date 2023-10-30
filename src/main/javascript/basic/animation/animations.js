const button = document.getElementById("button");
const animation = document.getElementById("div");

button.addEventListener("click", begin);
button.addEventListener("click", rotate);

function begin() {
    let timerId = null;
    let x = 0;
    let y = 0;
    timerId = setInterval(frame, 5);

    function frame() {
        if (x >=200 || y >= 200) clearInterval(timerId);
        else {
            animation.style.left = ++x + "px";
            animation.style.top = ++y + "px";
        }
    }
}

function rotate() {
    let timerId = null;
    let degrees = 0;
    timerId = setInterval(frame, 5);

    function frame() {
        if (degrees >= 360) clearInterval(timerId);
        else {
            //animation.style.transform = "rotateX("+(++degrees)+"deg)";
            //animation.style.transform = "rotateY("+(++degrees)+"deg)";
            animation.style.transform = "rotateZ("+(++degrees)+"deg)";
        }
    }
}