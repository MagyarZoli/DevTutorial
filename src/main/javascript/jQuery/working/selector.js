$("document").ready(function() {
    //$("p").css("border", "3px solid red");
    //$(".a").css("border", "3px solid red");
    //$("#example").css("border", "3px solid red");
    $("p.b").css("border", "3px solid red");
});

$("document").ready(function() {
    // $("div > p").css("border", "3px solid red");
    // $("div p").css("border", "3px solid red");
    // $("ul + div").css("border", "3px solid red");
    $("para1 ~ p").css("border", "3px solid red");
});