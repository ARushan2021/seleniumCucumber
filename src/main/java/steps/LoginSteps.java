package steps;

import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @And("^Старица авторизации: вводим логин \"([^\"]*)\", пароль \"([^\"]*)\"$")
    public void loginPageCucumber(String login, String password) {
        loginPage.enterLoginPassword(login, password);
        loginPage.submitClick();
    }
}