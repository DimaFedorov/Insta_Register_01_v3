package com.instagram.email;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
    public static RequestSpecification requestSpec()
    {
        return new RequestSpecBuilder()
                .setBaseUri("https://privatix-temp-mail-v1.p.rapidapi.com/request/")
                .setContentType(ContentType.JSON)
                .addHeader("X-RapidAPI-Key", "ce5e015153mshedeb875897dd495p1924f6jsnad40fe8b7cbf")
                .addHeader("X-RapidAPI-Host", "privatix-temp-mail-v1.p.rapidapi.com")
                .build();
    }
    public static ResponseSpecification responseSpecOk200()
    {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
    public static ResponseSpecification responseSpecError400()
    {
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }
    public static void installSpecification(RequestSpecification request,ResponseSpecification response)
    {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
