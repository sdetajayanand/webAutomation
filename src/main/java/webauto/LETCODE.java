package webauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class LETCODE {

    WebDriver webDriver = new ChromeDriver();
    public void inputs() throws InterruptedException {
        webDriver.get("https://letcode.in/");
        webDriver.manage().window().maximize();
        Actions actions = new Actions(webDriver);
        WebElement practicepage = webDriver.findElement(By.id("testing"));
        actions.moveToElement(practicepage).click().perform();
        webDriver.findElement(By.cssSelector("body > app-root > app-test-site > section:nth-child(2) > div > div > div > div:nth-child(1) > app-menu > div > footer > a")).click();
        webDriver.findElement(By.id("fullName")).sendKeys("Ajay Anand");
        String s = webDriver.findElement(By.id("fullName")).getText();
        System.out.println("Full Name is "+ s);
        webDriver.findElement(By.id("clearMe")).clear();
        webDriver.findElement(By.id("noEdit")).isEnabled();
        sleep(3000);
        webDriver.findElement(By.id("fullName")).sendKeys(s);
        sleep(4000);
        webDriver.quit();
    }

    public void dropdowns() throws InterruptedException {
        webDriver.get("https://letcode.in/");
        webDriver.manage().window().maximize();
        Actions actions = new Actions(webDriver);
        WebElement practicepage = webDriver.findElement(By.id("testing"));
        actions.moveToElement(practicepage).click().perform();
        webDriver.findElement(By.cssSelector("body > app-root > app-test-site > section:nth-child(2) > div > div > div > div:nth-child(3) > app-menu > div > footer > a")).click();
        WebElement firstDrop = webDriver.findElement(By.id("fruits"));
        WebElement secondDrop = webDriver.findElement(By.id("superheros"));
        WebElement thirdDrop = webDriver.findElement(By.id("lang"));
        WebElement fourthDrop = webDriver.findElement(By.id("country"));
        Select firstselect = new Select(firstDrop);
        Select secondselect = new Select(secondDrop);
        Select thirdselect = new Select(thirdDrop);
        Select fourthselect = new Select(fourthDrop);
        firstselect.selectByVisibleText("Apple");
        secondselect.selectByValue("sm");
        thirdselect.selectByIndex(thirdselect.getOptions().size()-1);
        fourthselect.selectByValue("India");
        sleep(5000);
        webDriver.quit();
    }

    public void alerts() throws InterruptedException {
        webDriver.get("https://letcode.in/");
        webDriver.manage().window().maximize();
        Actions actions = new Actions(webDriver);
        WebElement practicepage = webDriver.findElement(By.id("testing"));
        actions.moveToElement(practicepage).click().perform();
        webDriver.findElement(By.cssSelector("body > app-root > app-test-site > section:nth-child(2) > div > div > div > div:nth-child(4) > app-menu > div > footer > a")).click();
        webDriver.findElement(By.id("accept")).click();
        //sleep(3000);
        webDriver.switchTo().alert().accept();
        sleep(3000);
        webDriver.findElement(By.id("confirm")).click();
//        //sleep(3000);
        webDriver.switchTo().alert().dismiss();
        sleep(3000);
//        alert.dismiss();
        webDriver.findElement(By.id("prompt")).click();
        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("Ajay");
        alert.accept();
//        webDriver.switchTo().alert().accept();
        sleep(3000);
        webDriver.findElement(By.id("modern")).click();
        webDriver.switchTo().alert().dismiss();
        sleep(3000);
        webDriver.quit();
    }
}

//testing
//fullName
//join
//getMe
//clearMe
//noEdit
//dontwrite