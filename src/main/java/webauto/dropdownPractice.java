package webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.input.Input;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;

public class dropdownPractice {
    WebDriver webDriver = new ChromeDriver();
   // webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    public void getWebsite()
    {
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        webDriver.manage().window().maximize();
    }
    public void dropDownOperations() throws InterruptedException {
        Thread.sleep(2000);
        WebElement dropelement = webDriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(dropelement);
        dropdown.selectByIndex(2);
        //System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        dropdown.selectByValue("INR");
       // System.out.println(dropdown.getFirstSelectedOption().getText());
    }
    public void dropDownDifferent() throws InterruptedException {
        WebElement diffelement = webDriver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]"));
        diffelement.click();
        Thread.sleep(2000);
        int i=0;
        while(i<5)
        {
            webDriver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        //webDriver.quit();
    }
    public void fullOperations() throws InterruptedException {
       webDriver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/input[1]")).click();
        webDriver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[4]/a")).click();
        webDriver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        webDriver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
        webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]/a")).click();
        Thread.sleep(2000);
      //  webDriver.quit();
    }

    public void orange()
    {
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webDriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).click();
        webDriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Bagnna");

    }
    public void makemytrip() throws AWTException, InterruptedException {
        webDriver.get("https://www.makemytrip.com/");
        webDriver.manage().window().maximize();
        Robot robot = new Robot();
        robot.mouseMove(5,300);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(8000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(8000);
        webDriver.quit();
    }
}
