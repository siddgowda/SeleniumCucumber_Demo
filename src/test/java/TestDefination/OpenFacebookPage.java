package TestDefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebookPage {

    //This is my Selenium Webdriver
    WebDriver driver;

    @Given("The browser is setup")
    public void the_browser_is_setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Browser is ready");

    }

//Added by dina
    @Given("Go to facebook page")
    public void go_to_facebook_page() {
        driver.get("https://de-de.facebook.com/");

    }

    //Added by siddu
    @Then("Validate the facebook page")
    public void validate_the_facebook_page() {
       String title =  driver.getTitle();
        Assert.assertEquals(title,"Facebook – Anmelden oder Registrieren");

    }

    //This is to close the browser
    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
        System.out.println("Close the browser");
    }


}
