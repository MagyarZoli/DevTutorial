package org.example.test.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest {

    private final String endpoint = "http://localhost/api_testing/product/delete.php";

    @Disabled
    @Test
    public void deletedProduct() {
        String body = """
                {
                "id": 19
                }
                """;
        ValidatableResponse response = given().body(body)
                .when().delete(endpoint)
                .then();
        response.log().body();
    }

    @Disabled
    @Test
    public void deletedSerializedProduct() {
        Product body = new Product(
                19,
                "Water Bottle",
                "Blue water bottle. Holds 64 ounces",
                12,
                3,
                "Active Wear - Women");
        ValidatableResponse response = given().body(body.getId())
                .when().delete(endpoint)
                .then();
        response.log().body();
    }
}