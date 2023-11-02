$(function() {
    $("#fadein").click(function() {
        // $("#theDiv").fadeIn();
        // $("#theDiv").fadeIn(200);
        $("#theDiv").fadeIn("normal");
    });
    $("#fadeout").click(function() {
        // $("#theDiv").fadeOut();
        // $("#theDiv").fadeOut(600);
        $("#theDiv").fadeOut("normal");
    });
    $("#fadeto3").click(function() {
        $("#theDiv").fadeTo("slow", 0.3);
    });
    $("#fadeup").click(function() {
        $("#theDiv").fadeTo("slow", 1.0, onComplete);
    });
    $("#pulse").click(function() {
        $("#theDiv").fadeTo("fast", 0.3)
            .fadeTo("fast", 1.0)
            .fadeTo("fast", 0.3)
            .fadeTo("fast", 1.0);
    });
});

function onComplete() {
    $(this).text("Fading effect complete");
}