$("document").ready(function () {
    document.getElementById("create").addEventListener("click", function (evt) {
        createContent();
    });
    document.getElementById("change").addEventListener("click", function (evt) {
        changeContent();
    });
    document.getElementById("changeAll").addEventListener("click", function (evt) {
        changeAllTheContent();
    });
});

function createContent() {
    $("#example").html("<p>Hi There</p>");
}

function changeContent() {
    var newItem = $("<p>This is a new paragraph</p>");
    $("#para1").html(newItem);
}

function changeAllTheContent() {
    $("#example p").text("I've change all the paragraphs!");
}