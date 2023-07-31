package steps;

import dev.failsafe.internal.util.Assert;
import Models.Response.UserResponse;
import Models.Response.ErrorResponse;
import Models.Request.RestClient;
import org.testng.Assert;

public class ApiValidationStep {
    // Method to validate the error response received from the API

    public void validateErrorResponse(UserResponse user, String expectedErrorMessage) {
        ErrorResponse errorResponse = RestClient.getAuthorizedUser(user.getUserName(), user.getPassword());
        Assert.assertEquals(errorResponse.getMessage(), expectedErrorMessage);
    }
}
