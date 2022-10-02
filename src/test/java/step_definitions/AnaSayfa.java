package step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AnaSayfa {

    WebDriver driver;
    BasePage basePage = new BasePage();

    @Test
    public void Test() {
        Driver.get().get(ConfigurationReader.get("url"));
        basePage.moduless("modules"); //module lar arasinda gidiyor




    }
}
