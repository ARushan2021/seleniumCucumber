package steps;

import pages.NewBusinessTripPage;

public class NewBusinessTripSteps {

    public FilledFieldBTSteps newBusinessTrip (){
        NewBusinessTripPage newBusinessTripPage = new NewBusinessTripPage();
        newBusinessTripPage.createBusinessTrip();

    return new FilledFieldBTSteps();

    }
}
