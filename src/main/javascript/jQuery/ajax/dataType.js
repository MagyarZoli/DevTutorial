$("document").ready(function() {
    // getXMLData();
    getJSONData();
});

function getXMLData() {
    $.get("../testxmldata.xml", function(result) {
        var title = result.getElementsByTagName("title")[0];
        var name = result.getElementsByTagName("name")[0];
        var val = `${title.firstChild.nodeValue} by ${name.firstChild.nodeValue}`;
        $("#ajaxContent").append(val);
    });
}

function getJSONData() {
    var flickrAPI = "http://api.flickr.com/services/feeds/photos_public.gne?jsoncallback=?";
    $.getJSON( flickrAPI, {
        tags: "space needle",
        tagmode: "any",
        format: "json"
    },
    successFn);
}

function successFn(result) {
    $.each(result.items, function(i, item) {
        $("<img>").attr("src", item.media.m).appendTo("#ajaxContent");
        if (i === 4) {
            return false;
        }
    });
}

function errorFn(xhr, status, strErr) {
    alert(strErr);
}