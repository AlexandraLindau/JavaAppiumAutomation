import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Local number does not equal 14", 14, getLocalNumber());
    }
}
