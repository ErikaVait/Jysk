package tests;

import org.testng.annotations.*;
import utilities.Driver;
import utilities.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeClass
    public void init(){
        Driver.initialize();
    }
    @AfterClass
    public void quit(){
        Driver.quit();
    }
}
