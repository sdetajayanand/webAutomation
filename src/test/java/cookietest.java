import org.testng.annotations.Test;
import webauto.CookieHandlingExample;

public class cookietest {

    CookieHandlingExample che = new CookieHandlingExample();

    @Test
    public void checkCookies()
    {
        che.handlingCookies();
    }
}
