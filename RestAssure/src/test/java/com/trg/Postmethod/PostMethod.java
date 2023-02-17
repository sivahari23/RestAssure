package com.trg.Postmethod;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {
	@Test
	public void postNewEmployee(){
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification resquestSpecification=
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "\"first_name\": \"siva\",\r\n"
						+ "\"last_name\": \"hariharan\",\r\n"
						+ "\"email\": \"siva@lao.com\"\r\n"
						+ "}");
		Response response = resquestSpecification.request(Method.POST,"employees");
		
		System.out.println(response.asPrettyString());
				
	}

}
