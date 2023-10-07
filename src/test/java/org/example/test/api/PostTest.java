package org.example.test.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostTest {

    private final String endpoint = "http://localhost/api_testing/product/create.php";

    @Disabled
    @Test
    public void createProduct() {
        String body = """
                {
                "name": "Water Bottle",
                "description": "Blue water bottle. Holds 64 ounces",
                "price": 12,
                "category_id": 3
                }
                """;
        ValidatableResponse response = given().body(body)
                .when().post(endpoint)
                .then();
        response.log().body();
    }

    @Disabled
    @Test
    public void createSerializedProduct() {
        Product body = new Product(
                "Water Bottle",
                "Blue water bottle. Holds 64 ounces",
                12,
                3,
                "Active Wear - Women");
        ValidatableResponse response = given().body(body)
                .when().post(endpoint)
                .then();
        response.log().body();
    }
}