package org.run;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sathish {
	public static void main(String[] args) {

		RestAssured.baseURI = "https://www.shriramfinance.in/article-most-relevant-senior-citizen-fd-rates-and-schemes";

		RequestSpecification requestSpecification = RestAssured.requestSpecification;

		RequestSpecification request = requestSpecification.given();

		Response response = request.get();

		System.out.println(response.getStatusCode());
 
		
	}

}
