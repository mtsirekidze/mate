import org.testng.annotations.Test;
import steps.*;

public class TestClassName {
    private CreateUserStep createUserStep = new CreateUserStep();
    private LoginPageStep loginPageStep = new LoginPageStep();
    private DeleteAccountStep deleteAccountStep = new DeleteAccountStep();
    private ErrorValidationStep errorValidationStep = new ErrorValidationStep();
    private ApiValidationStep apiValidationStep = new ApiValidationStep();
    private Models.Response.UserResponse userResponse;

    @Test(priority = 1)
    public void testCreateUser() {
        userResponse = createUserStep.createUser();
    }

    @Test(priority = 2)
    public void testLoginWithNewUser() {
        loginPageStep.login(userResponse);
    }

    @Test(priority = 3)
    public void testDeleteAccount() {
        deleteAccountStep.deleteAccount();
    }

    @Test(priority = 4)
    public void testErrorValidation() {
        errorValidationStep.validateErrorMessage("Invalid username or password!");
    }

    @Test(priority = 5)
    public void testApiValidation() {
        apiValidationStep.validateErrorResponse(userResponse, "User not found!");
    }
}
