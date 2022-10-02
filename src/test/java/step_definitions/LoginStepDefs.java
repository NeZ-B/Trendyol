package step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class LoginStepDefs {
    WebDriver driver;


    @Test
    public void Test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> listOfModule = driver.findElements(By.cssSelector("li.sf-MenuItems-WulWXvlfIAwNiOUGY7FP"));

        Actions actions=new Actions(driver);

//        for (WebElement eachListOfModule : listOfModule) {
//            eachListOfModule.getText().trim().equals("Moda");
//            actions.moveToElement(eachListOfModule).perform();
//            eachListOfModule.click();
//            System.out.println(eachListOfModule.getText());
//        }
    }

    public void hepsiBuradaModuleList() {
        LoginPage loginPage = new LoginPage();
        Driver.get().get(ConfigurationReader.get("url"));
        //go to moda
        List<WebElement> listOfModule = driver.findElements(By.cssSelector("li.sf-MenuItems-WulWXvlfIAwNiOUGY7FP"));

        for (WebElement eachListOfModule : listOfModule) {
            eachListOfModule.getText().trim().equals("Moda");
            System.out.println(eachListOfModule.getText());


        }


    }

}