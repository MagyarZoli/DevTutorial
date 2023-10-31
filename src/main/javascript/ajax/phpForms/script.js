document.getElementById("button")
    .addEventListener("click", getName);
document.getElementById("getForm")
    .addEventListener("submit", getName);
document.getElementById("postForm")
    .addEventListener("submit", postName);

// function getName() {
//     let xhr = new XMLHttpRequest();
//     xhr.open("GET", "process.php?name=Brad", true);
//
//     xhr.onload = function () {
//         console.log(xhr.responseText);
//     }
//
//     xhr.send();
// }

function getName(e) {
    e.preventDefault();
    let name = document.getElementById("name1").value;

    let xhr = new XMLHttpRequest();
    xhr.open("GET", `process.php?name=${name}`, true);

    xhr.onload = function () {
        console.log(xhr.responseText);
    }

    xhr.send();
}

function postName(e) {
    e.preventDefault();
    let name = document.getElementById("name1").value;
    let params = `name=${name}`;

    let xhr = new XMLHttpRequest();
    xhr.open("POST", "process.php", true);

    xhr.setRequestHeader("Content-type", "application/x-from-urlencoded");

    xhr.onload = function () {
        console.log(xhr.responseText);
    }

    xhr.send(params);
}