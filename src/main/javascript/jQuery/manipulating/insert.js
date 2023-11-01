$("document").ready(function() {
    // $("#example p").append(" with some content appended");
    // $("#example p").prepend("Hello! ");

    // $("#example p:last").appendTo("#example p:first");
    // $("#example p:last").prependTo("#example p:first");

    // $("#example p").after("--");
    // $("#example p").before("**");

    $("<p>New Para after</p>").insertAfter("#example p:first");
    $("<p>New Para before</p>").insertBefore("#example p:last");
});