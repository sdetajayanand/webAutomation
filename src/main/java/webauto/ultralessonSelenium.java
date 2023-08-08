package webauto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ultralessonSelenium {
    WebDriver webDriver = new ChromeDriver();
    public void gettingWeb() throws InterruptedException {

        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(webDriver, 10)
        //webDriver.wait(3000);
        //sleep(5000);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/summary/span")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).sendKeys("Shirt");
        sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).clear();
        sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).sendKeys("Shirt");
        sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button")).click();
        sleep(3000);
        webDriver.navigate().refresh();
        sleep(3000);
        webDriver.navigate().back();
        sleep(3000);
        webDriver.navigate().forward();
        sleep(3000);
        webDriver.quit();
    }

    public void createAccount() throws InterruptedException {
        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]")).click();
        webDriver.findElement(By.xpath("/html/body/main/div/div[2]/form/a[2]")).click();
        webDriver.findElement(By.id("RegisterForm-FirstName")).click();
        webDriver.findElement(By.id("RegisterForm-FirstName")).sendKeys("aish");
        //RegisterForm-LastName   RegisterForm-email    RegisterForm-password
        webDriver.findElement(By.id("RegisterForm-LastName")).click();
        webDriver.findElement(By.id("RegisterForm-LastName")).sendKeys("Kumber");
        webDriver.findElement(By.id("RegisterForm-email")).click();
        webDriver.findElement(By.id("RegisterForm-email")).sendKeys("aish@gmail.com");
        webDriver.findElement(By.id("RegisterForm-password")).click();
        webDriver.findElement(By.id("RegisterForm-password")).sendKeys("hiok6946");
        webDriver.findElement(By.xpath("/html/body/main/div/form/button")).submit();
        sleep(15000);
        webDriver.quit();

    }
    public void login() throws InterruptedException {
        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]")).click();
        webDriver.findElement(By.id("CustomerEmail")).sendKeys("ajay@gmail.com");
        webDriver.findElement(By.id("CustomerPassword")).sendKeys("hixk6946");
        webDriver.findElement(By.xpath("/html/body/main/div/div[2]/form/button")).click();
        sleep(20000);
        webDriver.quit();
    }

    public void advancedMouseAndKeyboards() throws InterruptedException {
        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebElement searchicon = webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/summary/span"));
        WebElement searchBar = webDriver.findElement(By.id("Search-In-Modal"));
        WebElement searchButton = webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(searchicon).click().perform();
       // actions.moveToElement(searchBar).sendKeys("Shirt").perform();
        actions.sendKeys(searchBar, "Jeans");
        actions.moveToElement(searchButton).click().perform();
        sleep(5000);
        webDriver.quit();
    }

    public void staticDropDown() throws InterruptedException {
        webDriver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebElement dropdown = webDriver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        sleep(3000);
        //select.selectByValue("Antarctica");
        select.selectByVisibleText("Antarctica");
        sleep(3000);
        select.selectByValue("IND");
        sleep(4000);
        webDriver.quit();
    }

    public void trygoogle() throws InterruptedException {
        webDriver.get("https://www.google.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        Actions action = new Actions(webDriver);
        WebElement area = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
        //action.sendKeys(area, "Baganna");
        action.moveToElement(area).click().perform();
        action.sendKeys(area, "Baganna");

        //area.sendKeys("baganna");
        sleep(4000);
    }

    public void tryexplicitwaits()
    {
        WebDriverManager.chromedriver().setup();
        webDriver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebDriverWait waitsa = new WebDriverWait(webDriver, Duration.ofSeconds(12));
        WebElement changetext = webDriver.findElement(By.id("populate-text"));
        changetext.click();
        waitsa.until(ExpectedConditions.textToBe(By.id("populate-text"), "Selenium Webdriver"));
        webDriver.quit();
    }

    public void iframes() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        webDriver.get("https://demo.automationtesting.in/Frames.html");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebElement iframebox = webDriver.findElement(By.xpath("body > section > div"));
        webDriver.switchTo().frame(iframebox);
        WebElement textbox = webDriver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        textbox.sendKeys("Hello World");
        webDriver.switchTo().defaultContent();
        sleep(3000);
        webDriver.quit();
    }

    public void checkbox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        webDriver.get("https://htmldog.com/examples/inputcheckboxes/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement iframe = webDriver.findElement(By.xpath("/html/body/article/section/figure/section/section[2]/div/samp/iframe"));
        webDriver.switchTo().frame(iframe);
        WebElement checkbox = webDriver.findElement(By.id("drama"));
        checkbox.click();
        webDriver.switchTo().defaultContent();
        sleep(4000);
        webDriver.quit();
    }

    public void radiobutton() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        webDriver.get("https://demoqa.com/radio-button");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        WebElement radiobuttonn = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        radiobuttonn.click();
        sleep(3000);
        webDriver.quit();
    }

    public void multipletabs() throws InterruptedException {
        webDriver.get("https://demo.automationtesting.in/Windows.html");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.cssSelector("#Tabbed > a > button")).click();
        sleep(2000);
        Set<String> windowHandles = webDriver.getWindowHandles();
        for(String windowHandle : windowHandles)
        {
            webDriver.switchTo().window(windowHandle);
            String webPageTitle = webDriver.getTitle();

            if(webPageTitle.equals("Selenium"))
            {
                System.out.println("I found that page");
                break;
            }
            else {
                System.out.println("Can't find this page");
            }
        }
        webDriver.close();
        webDriver.switchTo().window(windowHandles.iterator().next());
        sleep(4000);
        webDriver.quit();
    }

    public void scrolling() throws InterruptedException {
        webDriver.get("https://web-playground.ultralesson.com/");
        webDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

//        // Scroll to specific element
//        WebElement newsletterSection = webDriver.findElement(By.cssSelector("Your Locator Here for Element to Scroll to"));
//        js.executeScript("arguments[0].scrollIntoView();", newsletterSection);
//        System.out.println("Successfully scrolled to the Email Newsletter section");
//
//        // Scroll to end of the page
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        System.out.println("Successfully scrolled to the end of the page");

        // Scroll up by a specific number of pixels
        js.executeScript("window.scrollBy(0, -500);");
        System.out.println("Successfully scrolled up by 500 pixels");
        sleep(4000);
        // Close the browser
        webDriver.close();
    }

    public void fullInteraction() throws InterruptedException {
        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]")).click();
        webDriver.findElement(By.id("CustomerEmail")).sendKeys("ajay@gmail.com");
        webDriver.findElement(By.id("CustomerPassword")).sendKeys("hixk6946");
        webDriver.findElement(By.xpath("/html/body/main/div/div[2]/form/button")).click();
        sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/nav/ul/li[1]/a")).click();
        webDriver.findElement(By.xpath("/html/body/main/section[1]/div/slider-component/ul/li[2]/div/div[1]/div/h3/a")).click();
        webDriver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[2]/div/div[4]/product-form/form/div/div/div/div/div/button[1]")).click();
        //webDriver.findElement(By.xpath("/html/body/div[2]/cart-notification/div/div/div[3]/form/button")).click();
        WebElement checkbox = webDriver.findElement(By.id("marketing_opt_in"));
        checkbox.click();
        WebElement dropdown1 = webDriver.findElement(By.id("Select0"));
        Select select1 = new Select(dropdown1);
        select1.selectByVisibleText("Use a new address");
        WebElement dropdown2 = webDriver.findElement(By.id("Select1"));
        Select select2 = new Select(dropdown2);
        select2.selectByVisibleText("Maldives");
        webDriver.findElement(By.id("address1")).sendKeys("TestVagrant Technologies");
        sleep(4000);
        webDriver.quit();
    }
}
