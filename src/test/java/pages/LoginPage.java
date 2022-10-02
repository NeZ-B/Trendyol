package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LoginPage extends BasePage{

    public WebDriver driver;

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

// trendyol ///////////////////////////////////////////////////////////

    @FindBy(xpath = "//button[.='ACCEPT']")  //button#onetrust-accept-btn-handler
    public WebElement accept;

    @FindBy(xpath = "//a/img[@alt='Banner Listing Item - 5375177']")
    public WebElement shopNewSeasonKnits;

    @FindBy(xpath = "//p[.='Sale']")
    public WebElement sale;



    @FindBy(xpath = "(//div//h3//span[@class='brand'])[1]")
    public  WebElement blackDress;

    @FindBy(css = "div#add-to-basket")  //elbiseyi karta ekleyecek    > button.default
    public WebElement addToCart;

    @FindBy(css = "a[title='My Cart']")  //   ///    //span[@class='icon-web-header-cart']
    public WebElement myCart;

    @FindBy(css = "button.checkout-btn")
    public WebElement checkOut;

    //login page trendyol
    @FindBy(css = "input#emaillogin")
    public WebElement email;

    @FindBy(css = "input#passwordlogin")
    public WebElement password;

    @FindBy(css = "div.login-button>button")  //.login-button>button
    public WebElement logInBtn;

    @FindBy(xpath = "//div[.='Google']")
    public WebElement enterWithGoogle;

    @FindBy(css = "li:nth-of-type(2) > div[role='link'] .w1I7fb")
    public WebElement chooseAccount;

    // module listele

    @FindBy(css = "div.category")
   public List<WebElement>  modules; //module lar (Sale, New in, Clothing , ....  , Brands)

    @FindBy(css = "select-country-code")
    public WebElement phonNumber;


    @FindBy(css = "div.subcategory-items.hasOneTitle>span>a")
    public List<WebElement> insideOfModuleList;

    @FindBy(css = "h3.name") // sayfadaki elbiseler
    public List<WebElement>  dresses;




    @FindBy(xpath = "//div[@class='category']")
    List<WebElement> categoryBar;


//    public String selectTheProduct(Integer product) {
//
//        List<WebElement>  urun = driver.findElements(By.xpath("(//div[@class='moria-ProductCard-bOkJXM eyecw s3rzwckbe0r'])[" + product + "]"));           /* //  //((//h3[@type='comfort'])[" + product +"] */
//        return (WebElement) urun;
//
//    }

    public static List<WebElement> getElementsText(List<WebElement> list) {
        List<WebElement> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el);
        }
        return elemTexts;
    }


    //select
    public void selectDropdown(){
        Select selectopt= new Select(phonNumber);
        selectopt.selectByVisibleText("+34");
    }


    public void moduleListTest(String module) throws InterruptedException {
        for (WebElement each : modules) {
            if (each.getText().equals(module)){
                BrowserUtils.clickWithJS(each);
                Thread.sleep(2000);
                each.click();
                break;
            }
        }


    }
    public void insideOfModuleList(String allProduct) throws InterruptedException {
        for (WebElement each : insideOfModuleList) {
            if (each.getText().equals(allProduct)) {
                BrowserUtils.scrollToElement(each);
                Thread.sleep(2000);
                BrowserUtils.clickWithJS(each);
                break;
            }
        }
    }

    public void dresses(String dress) throws InterruptedException {
   //     //  (//h3[@type='comfort'])[" + product +"]")
        for (WebElement eachdress : dresses) {
            if (eachdress.getText().equals(dress)) {
                BrowserUtils.scrollToElement(eachdress);
                Thread.sleep(2000);
                BrowserUtils.clickWithJS(eachdress);
                break;
            }

        }

    }

//    public static void secondWindow() {
//        Set<String>handles= Driver.get().getWindowHandle();
//         Set<String> handles=Driver.get().getWindowHandles();
//    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }
    public void windowHandle() throws InterruptedException {


    Set<String> allWindows=driver.getWindowHandles();
    int count=allWindows.size();
        for (String child:allWindows) {
        if (!dresses.equals(child)) {
            driver.switchTo().window(child);
            Thread.sleep(2000);
            BrowserUtils.scrollToElement(addToCart);
        }
    }
    }

    //        Set<String> allWindows=driver.getWindowHandles();
//        int count=allWindows.size();
//        for (String child:allWindows) {
//            if (!loginPage.dresses.equals(child)) {
//                driver.switchTo().window(child);
//                Thread.sleep(2000);
//                BrowserUtils.scrollToElement(loginPage.addToCart);
//            }
//        }
    // loginPage.windowHandle();

//        Thread.sleep(2000);
//       String Title=Driver.get().getTitle();
}