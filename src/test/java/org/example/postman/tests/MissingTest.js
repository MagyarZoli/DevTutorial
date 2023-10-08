pm.test("Missing First Name error message is returned", function () {
    pm.expect(pm.response.text()).to.include("Path 'firstName' is required");
});