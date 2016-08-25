package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

/**
 * Created by soren on 8/24/2016.
 */
public class Base {
    public WebDriver driver = null;
    @BeforeMethod
    public void setUp(String url){


    }


    @AfterMethod
    public void cleanUp(){

    }
}