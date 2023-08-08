package webauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.ArrayList;
import webauto.models.Item;

public class HomePage {
    WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void search(String searchItem) {
//        webDriver.findElement(By.id("Search-In-Modal")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/summary/span" +
                "")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]")).sendKeys(searchItem);
        webDriver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button")).click();
    }
    public List<Item> getSearchItems() {
        return new ArrayList<>();
    }
}