$(function() {
    $("#evtTarget").hover(highlight, highlight);

    $("#evtTarget").click(fnClick1);

    $("#evtTarget").dblclick(fnClick2);

    $(window).resize(fnResize);

    $("#evtTarget").one("click", function() {
        $(this).css({ borderWidth: "4px",
            cursor: "pointer"
        });
    });
});

function highlight(evt) {
    $("#evtTarget").toggleClass("highlighted");
}

function fnClick1() {
    $("#evtTarget").html("Click");
}

function fnClick2() {
    $("#evtTarget").html("Double Click");
}

function fnResize() {
    $("#evtTarget").html("Browser window resized");
}