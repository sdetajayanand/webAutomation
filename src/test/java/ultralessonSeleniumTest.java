import org.testng.annotations.Test;
import webauto.HeadlessModeExample;
import webauto.ultralessonSelenium;

public class ultralessonSeleniumTest {
    ultralessonSelenium uls = new ultralessonSelenium();
   // HeadlessModeExample hme = new HeadlessModeExample();
    @Test
    public void checkWeb() throws InterruptedException {
        //uls.gettingWeb();
       //uls.createAccount();
        //uls.login();
       // uls.advancedMouseAndKeyboards();
       // uls.staticDropDown();
        //uls.trygoogle();
        //uls.tryexplicitwaits();
        //uls.iframes();
        //uls.checkbox();
        //uls.radiobutton();
        //uls.multipletabs();
        //uls.scrolling();
        uls.fullInteraction();
    }
}
