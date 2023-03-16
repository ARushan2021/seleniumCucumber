package steps;

import io.cucumber.java.en.And;
import pages.AssertFilledFieldBTPage;

public class AssertFilledFieldBTSteps {

    AssertFilledFieldBTPage assertFilledFieldBTPage = new AssertFilledFieldBTPage();

    @And("^Проверяем поля, в том числе: город прибытия \"([^\"]*)\", дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void assertBTCucumber(String inputArrivalCity, String departureDate, String returnDate) {
        assertFilledFieldBTPage.CheckedValue();
        assertFilledFieldBTPage.AssertAllBT(inputArrivalCity, departureDate, returnDate);
        assertFilledFieldBTPage.saveAndClose();
        assertFilledFieldBTPage.assertEqualsBT();
    }
}
