let username;

document.getElementById("id_button").onclick = function() {
    username = document.getElementById("id_text").value;
    console.log("Difficult Way:", username);
    document.getElementById("id_label").innerHTML = "Hello " + username;
}