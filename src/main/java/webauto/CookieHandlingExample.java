package webauto;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandlingExample {
    WebDriver webDriver = new ChromeDriver();

    public void handlingCookies()
    {
        webDriver.get("https://web-playground.ultralesson.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();
        Cookie excookie = new Cookie("example", "value");
        webDriver.manage().addCookie(excookie);
        Cookie retrievedcookie = webDriver.manage().getCookieNamed("example");
        System.out.println("Retrieved Cookie :- " +retrievedcookie);
        webDriver.manage().deleteCookieNamed("example");
        Cookie deletedcookie = webDriver.manage().getCookieNamed("example");
        System.out.println("deleted cookie :- " +deletedcookie);
        webDriver.quit();
    }
}
