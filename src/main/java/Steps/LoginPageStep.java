package steps;

import Models.Response.UserResponse;
import pages.LoginPage;

public class LoginPageStep {
    // Method to perform login using the UserResponse object

    public void login(UserResponse user) {
        LoginPage page = new LoginPage();
        page.login(user.getUserName(), user.getPassword());
    }
}
