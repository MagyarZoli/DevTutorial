package org.example.test.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class VerifyingTest {

    private final String endpoint = "http://localhost/api_testing/product/read_one.php";

    @Disabled
    @Test
    public void getProduct_VerifyingStatus() {
        given().queryParam("id", 2)
                .when().get(endpoint)
                .then()
                .assertThat().statusCode(200);
    }

    @Disabled
    @Test
    public void getProduct_Accessing() {
        given().queryParam("id", 2)
                .when().get(endpoint)
                .then()
                .log().body();
    }

    @Disabled
    @Test
    public void getProduct_VerifyingFields() {
        given().queryParam("id", 2)
                .when().get(endpoint)
                .then()
                .assertThat().statusCode(200)
                .body("id", equalTo("2"))
                .body("name", equalTo("Cross-Back Training Tank"))
                .body("description", equalTo("The most awesome phone of 2013!"))
                .body("price", equalTo("299.00"))
                .body("category_id", equalTo("2"))
                .body("category_name", equalTo("Active Wear - Women"));
    }

    @Disabled
    @Test
    public void getProduct_VerifyingFields2() {
        given().queryParam("id", 2)
                .when().get(endpoint)
                .then()
                .log().body()
                .assertThat().statusCode(200)
                .body("records.size()", greaterThan(0))
                .body("records.id", everyItem(notNullValue()))
                .body("records.name", everyItem(notNullValue()))
                .body("records.description", everyItem(notNullValue()))
                .body("records.price", everyItem(notNullValue()))
                .body("records.category_id", everyItem(notNullValue()))
                .body("records.category_name", everyItem(notNullValue()))
                .body("records.id[0]", equalTo("25"));
    }

    @Disabled
    @Test
    public void getProduct_VerifyingFields3() {
        given().queryParam("id", 2)
                .when().get(endpoint)
                .then()
                .log().headers()
                .assertThat().statusCode(200)
                .headers("Content-Type", equalTo("application/json; charset=UTF-8"))
                .body("records.size()", greaterThan(0))
                .body("records.id", everyItem(notNullValue()))
                .body("records.name", everyItem(notNullValue()))
                .body("records.description", everyItem(notNullValue()))
                .body("records.price", everyItem(notNullValue()))
                .body("records.category_id", everyItem(notNullValue()))
                .body("records.category_name", everyItem(notNullValue()))
                .body("records.id[0]", equalTo("25"));
    }
}