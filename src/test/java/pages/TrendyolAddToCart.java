package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TrendyolAddToCart {
    WebDriver driver;
    LoginPage loginPage=new LoginPage();


    @Test //end2End urun alip sepete atma
    public void Test() throws InterruptedException { WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/en/trendyol-collection/evening-prom-dress-blue-wrapover-p-89252647");
        BrowserUtils.waitFor(3);
        loginPage.accept.click();

       // loginPage.dresses("Trendyol CollectionEvening & Prom Dress - Blue - Wrapover");



    }
    }
