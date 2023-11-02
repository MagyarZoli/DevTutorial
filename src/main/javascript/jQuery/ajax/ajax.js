$("document").ready(function() {
    getData();
});

function getData() {
    $.ajax({
        url: "../testdata.txt",
        type: "GET",
        dataType : "text",
        success: successFn,
        error: errorFn,
        complete: function( xhr, status ) {
            console.log("The request is complete!");
        }
    });
}

function successFn(result) {
    console.log("Setting result");
    $("#ajaxContent").append(result);
}

function errorFn(xhr, status, strErr) {
    console.log("There was an error!");
}