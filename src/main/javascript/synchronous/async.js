async function loadFile() {
    let fileLoaded = true;
    if (fileLoaded) return "File loaded";
    else throw "File NOT loaded";
}

loadFile().then(value => console.log(value))
    .catch(error => console.log(error));

function loadFile2() {
    let fileLoaded = true;
    if (fileLoaded) Promise.resolve("File loaded");
    else Promise.reject("File NOT loaded");
}

loadFile2().then(value => console.log(value))
    .catch(error => console.log(error));