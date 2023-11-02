$(function() {
    $("#show").click(function() {
        // $("#theDiv").show("normal");
        $("#theDiv").show("fast");
    });
    $("#hide").click(function() {
        // $("#theDiv").hide(1000, "linear");
        $("#theDiv").hide(1000, "swing");
    });
    $("#toggle").click(function() {
        $("#theDiv").toggle("slow", completion);
    });
});

function completion() {
    $(this).text("Animation complete");
}