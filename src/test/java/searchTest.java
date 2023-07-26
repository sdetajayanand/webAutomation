import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import webauto.models.Item;
import webauto.pages.HomePage;
import webauto.pages.LauncherPage;

import java.util.List;


public class searchTest {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        WebDriver webdriver = new ChromeDriver();
        //Arrange
        String searchItem = "Jeans";
        String searchKey = "Jean";
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
       launcherPage.navigateTo("https://web-playground.ultralesson.com/");
       // webdriver.get("https://flipkart.com/");
        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert
        Assert.assertEquals(4, searchItems.size());
        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));

    }
}
