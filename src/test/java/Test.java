import basic.BasicSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Test {
    @Managed
    WebDriver driver;

    @Steps
    public BasicSteps basicSteps;



    @org.junit.Test
    public void userLogin() {
        basicSteps.openStartPage(driver);

        basicSteps.checkSearchPlayers("Чебан","Валерий","Анатольвич");
        // посмотреть скриншот, найден объект или нет
        basicSteps.searchMoscow();
        basicSteps.search8x8();
        basicSteps.searchNorth();
        basicSteps.searchDivision("Третий","C");
        basicSteps.searchTeamOverDiv("ФутЛаб");
        basicSteps.searchPlayerOverTeam("Чебан","Валерий");

    }


}
