package com.instagram.email;

import io.restassured.RestAssured;

import java.util.List;
import java.util.stream.Collectors;

public class TempEmail {


    public static String Email(){
        Specification.installSpecification(Specification.requestSpec(),Specification.responseSpecOk200());
        List<Pojo_for_Email> email = RestAssured.given()
                .when()
                .get("mail/id/4ee62c33f13db0bd09d13eeed43a8dbb/")
                .then().log().all()
                .extract().body().jsonPath().getList("", Pojo_for_Email.class);
        String regex = "[a-zA-Z]+";
        List<String> mail_subject = email.stream().map(Pojo_for_Email::getMail_subject).collect(Collectors.toList());
        String transform = "";
        for (int i = 0; i< mail_subject.size();i++) {
             {
                transform = mail_subject.get(0).replaceAll(regex, "");
            }
        }
        return transform;
    }
}
