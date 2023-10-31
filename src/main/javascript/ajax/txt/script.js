document.getElementById("button")
    .addEventListener("click", loadText);

function loadText() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "sample.txt", true);

    console.log(`READYSTATE: ${xhr.readyState}`);
    // readyState Values:
    // 0: request not initialized
    // 1: server connection established
    // 2: request received
    // 3: processing request
    // 4: request finished and response is ready

    xhr.onprogress = function () {
        console.log(`onprogress READYSTATE: ${xhr.readyState}`);
    };

    xhr.onload = function () {
        console.log(`onload READYSTATE: ${xhr.readyState}`);
        if (this.status === 200) {
            document.getElementById("text").innerHTML = this.responseText;
        } else if (this.status === 404) {
            document.getElementById("text").innerHTML = "Not Found";
        }
    };

    xhr.onerror = function () {
        console.log("Request Error...");
    };

    xhr.onreadystatechange = function () {
        console.log(`onreadystatechange READYSTATE: ${xhr.readyState}`);
        if (this.readyState === 4 && this.status === 200) {
            // console.log(this.responseText);
        }
    };

    xhr.send();
}