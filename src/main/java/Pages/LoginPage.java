package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends pages.PageBase {
    // Page elements

    private final SelenideElement userNameField = $("#userName");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login");
    // Method to perform login action

    public void login(String userName, String password) {
        userNameField.setValue(userName);
        passwordField.setValue(password);
        loginButton.click();
    }
    // Method to get the error message from the login button (if any)

    public String getErrorMessage() {
        return loginButton.getText();
    }
}
