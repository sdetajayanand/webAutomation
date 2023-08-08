import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import webauto.models.Item;
import webauto.pages.HomePage;
import webauto.pages.LauncherPage;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class searchTest {
    WebDriver webdriver = new ChromeDriver();

    @Test
    public void verifyIfSearchTermShowsRelevantResults() {

        //Arrange
        String searchItem = "Jeans";
        String searchKey = "Jeans";
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
        // webdriver.get("https://flipkart.com/");
        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();
        //Thread.sleep(10000);
        webdriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        webdriver.manage().window().maximize();
        //  Assert
        // Assert.assertEquals(0, searchItems.size());
        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));

    }

    @Test
    public void somemoreoperations() {
        webdriver.get("https://web-playground.ultralesson.com/");
        webdriver.findElement(By.xpath("//*[@id=\"shopify-section-template--15328405749981__featured_products\"]/div/div[2]/a")).click();
    }

}
