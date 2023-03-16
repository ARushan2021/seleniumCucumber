package steps;

import io.cucumber.java.en.And;
import pages.NewBusinessTripPage;

public class NewBusinessTripSteps {

    NewBusinessTripPage newBusinessTripPage = new NewBusinessTripPage();

    @And("^Открываем страницу заявки новой командировки $")
    public void newBusinessTripCucumber(){
        newBusinessTripPage.createBusinessTrip();
    }
}
