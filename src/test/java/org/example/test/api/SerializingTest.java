package org.example.test.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SerializingTest {

    @Disabled
    @Test
    public void createSerializedProduct() {
        String endpoint = "http://localhost/api_testing/product/create.php";
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

    @Disabled
    @Test
    public void getProduct() {
        String endpoint = "http://localhost/api_testing/product/read_one.php";
        ValidatableResponse response = given().queryParam("id", 2)
                .when().get(endpoint)
                .then();
        response.log().body();
    }

    @Disabled
    @Test
    public void updateSerializedProduct() {
        String endpoint = "http://localhost/api_testing/product/update.php";
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

    @Disabled
    @Test
    public void deletedSerializedProduct() {
        String endpoint = "http://localhost/api_testing/product/delete.php";
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