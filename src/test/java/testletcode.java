import org.testng.annotations.Test;
import webauto.LETCODE;

public class testletcode {

    LETCODE letcode = new LETCODE();
    @Test
    public void testletcode() throws InterruptedException {
        //letcode.inputs();
        //letcode.dropdowns();
        letcode.alerts();
    }
}
