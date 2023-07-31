package steps;

import org.testng.Assert;
import pages.LoginPage;

public class ErrorValidationStep {
    // Method to validate the error message on the login page

    public void validateErrorMessage(String expectedErrorMessage) {
        LoginPage page = new LoginPage();
        String actualErrorMessage = page.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
