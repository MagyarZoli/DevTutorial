package org.example.test.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetTest {

    @Disabled
    @Test
    public void getCategories() {
        String endpoint2 = "http://localhost/api_testing/categories/read.php";
        ValidatableResponse response = given()
                .when().get(endpoint2)
                .then();
        response.log().body();
    }

    @Disabled
    @Test
    public void getProduct() {
        String endpoint = "http://localhost/api_testing/product/read_one.php";
        ValidatableResponse response = given().queryParam("id", 2)
                .when().get(endpoint)
                .then();
        response.log().body();
    }
}