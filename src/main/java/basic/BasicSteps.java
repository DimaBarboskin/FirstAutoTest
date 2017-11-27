package basic;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasicSteps extends ScenarioSteps {
    @Step("открываем страницу")
    public void openStartPage(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.lfl.ru/");
    }

    @Step("ищем игрока по имени фамилии и отчеству")
    public void checkSearchPlayers(String lastname, String firstname, String fatherName){
        getDriver().findElement(By.xpath("//*[@name = 'q']")).sendKeys(lastname +
                " " + firstname + " " + fatherName);
        getDriver().findElement(By.xpath("//*[@class = 'search_narrow']")).click();
    }

    @Step("ищем москву")
    public void searchMoscow(){
        getDriver().findElement(By.xpath("//a[contains(.,'Москва')]")).click();
    }

    @Step("ищем чепионат 8на8")
    public void search8x8(){
        getDriver().findElement(By.xpath("//a[contains(.,'moscow8x8')]")).click();
    }

    @Step("ищем северную лигу")
    public void searchNorth(){
        getDriver().findElement(By.xpath("//a[contains(.,'sever.lfl.ru')]")).click();
    }

    @Step("посмотреть таблицу дивизина")
    public void searchDivision(String number,String letterDivision){
        getDriver().findElement(By.xpath("//a[contains(.,'" + number + " дивизион," +
                " группа " + letterDivision + "')]")).click();
    }

    @Step("ищем команду через дивизион")
    public void searchTeamOverDiv(String teamName){
        getDriver().findElement(By.xpath("//a[contains(.,'"+teamName+"')]")).click();
    }

    @Step("ищем игрока через команду и смотрим его статистику")
    public void searchPlayerOverTeam(String lastname, String firstname){
        getDriver().findElement(By.xpath("//a[contains(.,'Подробный список')]")).click();
        getDriver().findElement(By.xpath("//a[contains(.,'" + lastname + " "
                + firstname + "')]")).click();
    }
}
