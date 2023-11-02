$(function() {
    // $("#evtTarget").bind("mouseover mouseleave", highlight);

    // $("#evtTarget").bind("click", function(evt) {
    //     $("#evtTarget").unbind("mouseover mouseleave", highlight);
    //     $("#evtTarget").html("<p>You shut off the hover effect!</p>");
    // });

    $("#evtTarget").on("mouseover mouseleave", highlight);

    $("#evtTarget").on("click", function(evt) {
        $("#evtTarget").off("mouseover mouseleave", highlight);
        $("#evtTarget").html("<p>You shut off the hover effect!</p>");
        $("#evtTarget").removeClass("highlighted");
    });

    $("#textEntry").on("keypress", function(evt) {
        $("#keyPress").text(String.fromCharCode(evt.charCode));
    });
});

function highlight(evt) {
    $("#evtTarget").toggleClass("highlighted");
}