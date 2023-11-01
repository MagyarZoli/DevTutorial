$("document").ready(function() {
    document.getElementById("show").addEventListener("click", function (evt) {
        alert(JSON.stringify($("#example").data(), null, "  "));
    });

    document.getElementById("store").addEventListener("click", function (evt) {
        $("#example").data("key1", 1234);
        $("#example").data("key2", "Joe Marini");
    });

    document.getElementById("remove").addEventListener("click", function (evt) {
        $("#example").removeData("key2");
    });
});