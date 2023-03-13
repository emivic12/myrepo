package restassured;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import org.json.simple.*;

import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MyFirstRestAssured {
	//RequestSpecification request=RestAssured.given();
	@Test
	public void getResponseBody() {
		RestAssured.given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();
	}
	@Test
public void getResponsecode() {
	int statuscode=RestAssured.given().queryParam("CUSTOMER_ID","68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1")
	           .queryParam("PASSWORD","1234!")
	           .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
	System.out.println("Status code:" +statuscode);
	RestAssured.given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
	
}
	@Test
	public void getResponseHeader() {
		System.out.println("The headers:" +RestAssured.given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().extract().headers());	
	}
	@Test
	public void getResponseTime() {
		System.out.println("The time to fetch Respose:" +RestAssured.given().get("http://demo.guru99.com/V4/sinkministatement.php").timeIn(TimeUnit.MILLISECONDS));
	}
}

