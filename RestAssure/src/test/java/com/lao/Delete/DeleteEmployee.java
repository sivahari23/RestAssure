package com.lao.Delete;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {
	@Test
	public void deleteEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/employees";
		
		RequestSpecification resquestSpecification = RestAssured.given()
				;
		Response response =resquestSpecification.request(Method.DELETE,"/1");
		
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
	}

}
