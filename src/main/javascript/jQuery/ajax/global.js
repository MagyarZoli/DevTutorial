$("document").ready(function() {
    $(document).ajaxStart(function () {
        console.log("AJAX starting");
    });

    $(document).ajaxStop(function () {
        console.log("AJAX request ended");
    });

    $(document).ajaxSend(function (evt, jqXHR, options) {
        console.log("About to Send request for data...");
    });

    $(document).ajaxComplete(function (evt, jqXHR, options) {
        console.log("Everything's finished!");
    });

    $(document).ajaxError(function (evt, jqXHR, settings, err) {
        console.log("Hmmm. Seems like there was a problem: " + err);
    });

    $(document).ajaxSuccess(function (evt, jqXHR, options) {
        console.log("Looks like everything worked!");
    });

    getData();
});

function getData() {
    $.get("../testdata.txt", successFn);
    //$.get("../testdataError.txt", successFn);
}

function successFn(result) {
    console.log("Setting result");
    $("#ajaxContent").append(result);
}

function errorFn(xhr, status, strErr) {
    alert(strErr);
}