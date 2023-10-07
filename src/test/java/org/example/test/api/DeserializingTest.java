package org.example.test.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

public class DeserializingTest {

    @Disabled
    @Test
    public void getDeserializedProduct() {
        String endpoint = "http://localhost/api_testing/product/read_one.php";
        Product expectedBody = new Product(
                2,
                "Cross-Bank Training Tank",
                "The most awesome phone  of 2013!",
                299.00,
                2,
                "Active Wear - Women");
        Product actualBody = given().queryParam("id", "2")
                .when().get(endpoint)
                .as(Product.class);
        assertThat(actualBody, samePropertyValuesAs(expectedBody));
    }
}