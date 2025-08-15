package base;

import org.junit.After;
import org.junit.Before;
import utils.DriverFactory;

public class BaseTest {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
