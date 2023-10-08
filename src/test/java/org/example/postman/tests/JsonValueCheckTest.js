pm.test("Correct first name is returned", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.firstName).to.eql(environmet.firstName);
});