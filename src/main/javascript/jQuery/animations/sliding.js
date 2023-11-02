$(function() {
    $("#slideup").click(function() {
        // $("#theDiv").slideUp();
        $("#theDiv").slideUp(1000);
    });
    $("#slidedown").click(function() {
        // $("#theDiv").slideDown();
        $("#theDiv").slideDown(200);
    });
    $("#toggle").click(function() {
        $("#theDiv").slideToggle("slow");
    });
});