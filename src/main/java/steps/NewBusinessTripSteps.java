package steps;

import ru.appline.project.pages.NewBusinessTripPage;

public class NewBusinessTripSteps {

    public FilledFieldBTSteps newBusinessTrip (){
        NewBusinessTripPage newBusinessTripPage = new NewBusinessTripPage();
        newBusinessTripPage.createBusinessTrip();

    return new FilledFieldBTSteps();

    }
}
