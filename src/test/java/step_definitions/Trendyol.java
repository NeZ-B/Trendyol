package step_definitions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Trendyol {
    WebDriver driver;
    LoginPage loginPage=new LoginPage();
    @Before
    public void setUp(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        Driver.get().get(ConfigurationReader.get("urlTrendyol"));
    }

    @Test //end2End urun alip sepete atma
    public void Test() throws InterruptedException {
        BrowserUtils.waitFor(2);
        loginPage.accept.click();
        BrowserUtils.waitForClickablility(loginPage.sale,2);
       loginPage.moduleListTest("Clothing");
        BrowserUtils.waitFor(2);
        loginPage.insideOfModuleList("Evening Dresses");
        BrowserUtils.waitFor(2);
      loginPage.dresses("Trendyol CollectionEvening & Prom Dress - Blue - Wrapover");
     Thread.sleep(3000);
    // loginPage.windowHandle();
        loginPage.addToCart.click();
      // BrowserUtils.scrollToElement(loginPage.addToCart);
        Thread.sleep(2000);
        BrowserUtils.hover(loginPage.myCart);
        Thread.sleep(2000);
       // BrowserUtils.waitForClickablility(loginPage.myCart,2);
      BrowserUtils.clickWithJS(loginPage.checkOut);
        // BrowserUtils.waitFor(3);
      loginPage.email.sendKeys("rosespn8@gmail.com");
        BrowserUtils.waitFor(2);
      loginPage.password.sendKeys("Sarioglan38");
        BrowserUtils.waitFor(2);
      BrowserUtils.clickWithJS(loginPage.logInBtn);





    }






    }

