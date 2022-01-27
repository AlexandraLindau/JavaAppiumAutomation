import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Local number does not equal 14", 14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        int max = 45;
        int testNumber = super.getClassNumber();
        Assert.assertTrue(String.format("Class number %s is less than 45", testNumber), testNumber >= max);
    }

}
