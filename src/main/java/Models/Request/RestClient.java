package Models.Request;

import io.restassured.http.ContentType;
import Models.Request.UserRequest;
import Models.Response.UserResponse;
import Models.Response.ErrorResponse;

import static io.restassured.RestAssured.given;

public class RestClient {
    public static UserResponse createUser(UserRequest request) {
        io.restassured.response.Response response = given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("https://bookstore.toolsqa.com/Account/v1/User");

        response.then().statusCode(200);
        return response.as(UserResponse.class);
    }

    public static ErrorResponse getAuthorizedUser(String userName, String password) {
        io.restassured.response.Response response = given()
                .auth().basic(userName, password)
                .when()
                .get("https://bookstore.toolsqa.com/Account/v1/Authorized");

        response.then().statusCode(404);
        return response.as(ErrorResponse.class);
    }
}
