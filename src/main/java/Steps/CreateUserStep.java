package steps;

import Data.UserData;
import Models.Request.UserRequest;
import Models.Response.UserResponse;
import Models.Request.RestClient;

public class CreateUserStep {
    // Method to create a user using REST API and return the response

    public UserResponse createUser() {
        UserData user = new UserData("mate", "tsirekidze", "tsirekidzemate35@gmail.com");
        UserRequest request = new UserRequest(user);
        UserResponse response = RestClient.createUser(request);
        return response;
    }
}
