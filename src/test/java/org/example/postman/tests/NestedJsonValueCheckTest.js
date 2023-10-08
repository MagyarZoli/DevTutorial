pm.test("Correct city is returned", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.address.city).to.eql("Belmont");
});