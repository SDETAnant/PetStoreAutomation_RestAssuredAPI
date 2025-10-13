package api.endpoints;

/*  
 * //Swagger URI --> https://petstore.swagger.io

 Create user(Post) : https://petstore.swagger.io/v2/user
 Get user (Get): https://petstore.swagger.io/v2/user/{username}
 Update user (Put) : https://petstore.swigger.io/v2/user/{username}
 Delete user (Delete) : https://petstore.swigger.io/v2/user/{username}

 */

public class Routes {
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//user module 
   //designing the end points for user model 
	// creating urls for all 4 htttp reqwts get put delete update 
	
	public static String post_url=base_url;//+/user/createWithList";  //concatnating base url and endpoint 
	public static String get_url="base_url"+"/user/{username}";
	public static String update_url="base_url"+"/user/{username}";
	public static String delete_url="base_url"+"/user/{username}";
	
	/* First we have to send the psot reuest then it create the new user the same username we have to capture and 
	 * 
	 * */

	
	//pet module 
	// here we can create pet module urls 
}
