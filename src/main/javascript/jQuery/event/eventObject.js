$(function() {
    $("#Div1").on("click dblclick", { name: "Div 1" }, function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });
    $("#Div2").on("click dblclick", { name: "Div 2" }, function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });
    $("#Div3").on("click dblclick", { name: "Div 3" }, function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });
    $("div.smallbox").on("mouseenter", function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });
    $("div.smallbox").on("mouseleave", function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });
    $("div.smallbox").on("mousemove", function(evt) {
        updateEventDetails(evt);
        evt.stopPropagation();
    });

    $("#input1").keypress(updateEventDetails);
});

function updateEventDetails(evt) {

    $(".detailLine span[id]").text("");

    $("#evtType").text(evt.type);
    $("#evtWhich").text(evt.which);
    $("#evtTarget").text(evt.target.id);
    if (evt.relatedTarget)
        $("#evtRelated").text(`${evt.relatedTarget.tagName}#${evt.relatedTarget.id}`);
    $("#evtPageX").text(evt.pageX);
    $("#evtPageY").text(evt.pageY);
    $("#evtClientX").text(evt.clientX);
    $("#evtClientY").text(evt.clientY);
    $("#evtMetaKey").text(evt.metaKey);
    if (evt.data)
        $("#evtData").text(evt.data.name);
}