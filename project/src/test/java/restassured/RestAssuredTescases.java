package restassured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.json.simple.*;
import org.testng.annotations.Test;

public class RestAssuredTescases {
	public static void main(String[] args) {
		
		given().when().get("https://www.google.co.in").then().statusCode(200);
			}
		
	}