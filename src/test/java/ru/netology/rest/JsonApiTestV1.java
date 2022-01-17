package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

class JsonApiTestV1 {
    @Test
    void shouldReturnJsonData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data1")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
