pm.test("Correct contact is returned", function () {
    pm.expect(pm.response.text()).to.include("postman01@gmail.com");
});