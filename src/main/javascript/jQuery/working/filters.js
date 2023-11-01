$("document").ready(function() {
    // $("#example p:first").css("border", "3px solid red");
    // $("#example p:last").css("border", "3px solid red");
    //$("#example p:even").css("border", "3px solid red");
    //$("#example p:odd").css("border", "3px solid red");
    $("#example p:not(p:eq(2))").css("border", "3px solid red");
});

$("document").ready(function() {
    // $("p[class]").css("border", "3px solid red");
    // $("p[id=para1]").css("border", "3px solid red");
    // $("p[id^=para]").css("border", "3px solid red");
    $("p[id^=para][lang*=en-]").css("border", "3px solid red");
});

$("document").ready(function() {
    // $("p:contains('3')").css("border", "3px solid red");
    // $("p:parent").css("border", "3px solid red");
    // $("div:has(p[class=a])").css("border", "3px solid red");
    // $("div p:first-child").css("border", "3px solid red");
    // $("div p:last-of-type").css("border", "3px solid red");
    // $("div p:nth-child(3)").css("border", "3px solid red");
    $("div p:nth-child(2n)").css("border", "3px solid red");
});