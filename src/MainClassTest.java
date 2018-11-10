import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        MainClass testMainClass = new MainClass();
        Assert.assertTrue("Число localNumber должно быть равно 14", testMainClass.localNumber == 14);
    }

}