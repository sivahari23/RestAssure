package com.trg.putMethod;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putmethod {

	@Test
	public void putMethod() {
		RestAssured.baseURI="http://localhost:3000/employees";
		
		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "\"first_name\": \"Dhanu\",\r\n"
						+ "\"last_name\": \"sivahariharan\",\r\n"
						+ "\"email\": \"dhanusiva@lao.com\"\r\n"
						+ "}");
		Response response = requestSpecification.request(Method.PUT,"/6");
		
		System.out.print(response.asPrettyString());
		System.out.println(response.statusLine());
		
		
	}
}
