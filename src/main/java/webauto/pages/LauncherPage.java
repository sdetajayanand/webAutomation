package webauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauncherPage {
    WebDriver webdriver;
    public LauncherPage(WebDriver webDriver) {
        this.webdriver = webDriver;
    }
    public void navigateTo(String url) {
        webdriver.get(url);
        //webdriver.navigate();
    }

}
