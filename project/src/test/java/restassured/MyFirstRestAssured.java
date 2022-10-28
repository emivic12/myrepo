package restassured;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import org.json.simple.*;

import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstRestAssured {
	RequestSpecification request=RestAssured.given();
	@Test(enabled=false)
	public static void getResponseBody() {
		RequestSpecification request=RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		Response response=request.get();
		String restring=response.asString();
		System.out.println("Response details" +restring);
		ValidatableResponse valres=response.then();
		valres.statusCode(200);
		valres.statusLine("HTTP/1.1 200 OK");
		
	}
	
	@Test(enabled=false)
	public void test() {
		
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		Response response=request.get();
		System.out.println(response.toString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void getweatherdetails() {
		//first specify base uri
		RestAssured.baseURI="https://mocki.io/v1/d4867d8b-b5d5-4a48-a4ab-79131b5809b8";
		//send this uri as get requiest
		//create request object
		RequestSpecification httprequest=RestAssured.given();
		//also create response object if we get response where to store so thats y
		//Response response=httprequest.request(Method.GET,"search?q=weather");
		Response response=httprequest.get();
		//start verify
		System.out.println(response.getBody().asString());
		//verify status code and line
		int statuscode=response.getStatusCode();
		System.out.println("statuscode:" +statuscode);
		Assert.assertEquals(statuscode, 200);
		String statusline=response.getStatusLine();
		System.out.println(statusline);
		}
	@Test
	public void postrequest() {
		RestAssured.baseURI="http://restapi.adequateshop.com/api";
		//request object
		RequestSpecification httprequest=RestAssured.given();
//for posting, request parameters are in json format so json object created
		//response object
		//request payload along with post request
		JSONObject requestparams=new JSONObject();
		requestparams.put("tourist_name", "hello");
		requestparams.put("tourist_email", "hh@com");
		requestparams.put("tourist_location", "chennai");
		//header
		httprequest.header("Content-Type", "application/json");
		//converted to json and send
		httprequest.body(requestparams.toJSONString());// attach above data to request
		//till now prepated data, now send request
		Response response=httprequest.request(Method.POST, "/Tourist");
		//need to verify 
		System.out.println(response.toString());
		System.out.println(response.statusCode());
		//what parameter you want from response
		//success code validation
		String successcoderesponse=response.jsonPath().get("Successcode");
		
	}
//endpoint(domain part) and requesturl(path parameters) with api key
}

