
package org.api.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredd {

	
	@Test
	private void demo() {

		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees";
		
		RequestSpecification given = RestAssured.given();
		
		Response request = given.request(Method.GET);
		
		System.out.println(request.prettyPrint());
		
		
	}
	
	
	
}
