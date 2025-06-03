package com.learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// This class serves as a base class for all test classes in the project.
public class BaseTest {

    // This is a placeholder for the WebDriver instance that can be used in tests.
    public static WebDriver driver;
    // This is a placeholder for the Properties object that can be used to load configuration settings.
    public static Properties prop = new Properties();
    public static FileReader fr;

    // You can add methods here that will be common to all tests, such as setup and teardown methods.
    @BeforeTest
    public void setup() throws IOException {
        // Load properties from a configuration file
        if(driver == null) {
            FileReader fr = new FileReader("src/test/resources/configfiles/config.properties");
            prop.load(fr);
        }
        // Initialize WebDriver based on the properties
        String browser = prop.getProperty("browser");
        String testUrl = prop.getProperty("testurl");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(testUrl); // Navigate to the test URL
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Initialize Firefox WebDriver
             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
             driver.get(testUrl); // Navigate to the test URL
        }
        // You can add more browsers here as needed
        // Common setup code for tests can be added here
        // For example, initializing WebDriver, setting timeouts, etc.
    }

    // This method can be used to clean up resources after tests are run.
    @AfterTest
    public void teardown() {
        // Close the WebDriver instance if it is initialized
        if (driver != null) {
            driver.close();
            System.out.println("Browser closed successfully.");
        }
        // Common teardown code for tests can be added here
        // For example, closing WebDriver, cleaning up resources, etc.
    }

}
