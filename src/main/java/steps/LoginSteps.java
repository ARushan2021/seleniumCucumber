package steps;

import pages.LoginPage;

public class LoginSteps {

    public NewBusinessTripSteps login(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterLoginPassword(login, password);
        loginPage.submitClick();

        return new NewBusinessTripSteps();
    }
}
