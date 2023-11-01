$("document").ready(function() {
    // $("#example").children().css("border", "3px solid red");

    // var elem = $("#example");
    // elem.prev().css("border", "3px solid red");
    // elem.next().css("border", "3px solid green");
    // // elem.parents().css("border", "3px solid blue");
    // elem.parentsUntil($("body")).css("border", "3px solid blue");

    // $("#example").find("#para4").css("border", "3px solid red");

    var leftMargin = 0;
    var border = 3;
    $("#example p").each(function (index, element) {
        $(element).css("border", `${border}px solid red`)
            .css("margin-left", leftMargin);
        border += 2;
        leftMargin += 10;
    });
});