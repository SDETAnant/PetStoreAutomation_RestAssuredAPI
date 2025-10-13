package api.endpoints;

// REST Assured core methods (given(), when(), then())
import static io.restassured.RestAssured.given;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response; 

///1.03 
public class UserEndPoints {
	
	// this class is created for performing CRUD operations 
	public static Response createUser(User payload) {
        Response response = given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(payload)
        .when()
            .post(Routes. post_url); // Add the POST method here
        
        return response;
		  
	}
	
	//Get method
	 public static Response getUser(String userName) {
        Response response = given()
                          .pathParam("username", userName)
            
        .when()
            .get(Routes.get_url); 
          return response;
		  
	}
	 public static Response updateUser(String userName, User payload) {
	        Response response = given()
	            .contentType(ContentType.JSON)
	            .accept(ContentType.JSON)
	            .body(payload)
	        .when()
	            .put(Routes.update_url); // Add the POST method here  
	        return response;
			  
		}
   }
