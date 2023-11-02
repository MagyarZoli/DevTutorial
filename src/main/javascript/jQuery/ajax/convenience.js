$("document").ready(function() {
    getData();
});

function getData() {
    $.get("../testdata.txt", successFn);

    // $("#content").load("../testdata.html");

    // $("#content").load("../testdata.html #p2");
}

function successFn(result) {
    console.log("Setting result");
    $("#ajaxContent").append(result);
}

function errorFn(xhr, status, strErr) {
    alert(strErr);
}