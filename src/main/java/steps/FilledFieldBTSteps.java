package steps;

import io.cucumber.java.en.And;
import pages.FilledFieldBTPage;

public class FilledFieldBTSteps {

    FilledFieldBTPage filledFieldBTPage = new FilledFieldBTPage();

    @And("^Заполняем поля командировки, в том числе: город прибытия \"([^\"]*)\", дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void AssertFilledFieldBTCucumber(String inputArrivalCity, String departureDate, String returnDate) {
        filledFieldBTPage.FilledFieldBT(inputArrivalCity, departureDate, returnDate);
    }

}
