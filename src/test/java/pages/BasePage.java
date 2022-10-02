package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.='Elektronik']/span") //Elektronik
    public WebElement elektronik;


    @FindBy(xpath = "//ul[@class='sf-MenuItems-MXhuaBP08HFYcFicDzFl']/li")
    List<WebElement> modules;  //module

    @FindBy(xpath = "//div[@class=\"sf-Herousel-FNsKknkGR7j9XYXQ2K7G\"]//div")
    public WebElement firsatlar; //firsatlar modulu

    public String moduless(String module)  {
        Actions actions =new Actions(Driver.get());
        for (WebElement eachmodule:modules) {
            eachmodule.getText().equals("Elektronik");
            BrowserUtils.waitFor(2);
            actions.moveToElement(eachmodule).perform();

            System.out.println(eachmodule.getText());





        }
        return module;

    }
//    public WebElement firsatlar(WebElement firsat){
//
//    }


}



