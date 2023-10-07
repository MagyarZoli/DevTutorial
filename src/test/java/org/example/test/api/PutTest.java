package org.example.test.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutTest {

    private final String endpoint = "http://localhost/api_testing/product/update.php";

    @Disabled
    @Test
    public void updateProduct() {
        String body = """
                {
                "id": 19,
                "name": "Water Bottle",
                 "description": "Blue water bottle. Holds 64 ounces",
                "price": 15,
                "category_id": 3
                }
                """;
        ValidatableResponse response = given().body(body)
                .when().put(endpoint)
                .then();
        response.log().body();
    }

    @Disabled
    @Test
    public void updateSerializedProduct() {
        Product body = new Product(
                19,
                "Water Bottle",
                "Blue water bottle. Holds 64 ounces",
                12,
                3,
                "Active Wear - Women");
        ValidatableResponse response = given().body(body)
                .when().put(endpoint)
                .then();
        response.log().body();
    }
}