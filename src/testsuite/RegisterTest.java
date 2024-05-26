package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/\n";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    /* userShouldNavigateToRegisterPageSuccessfully
     * click on the ‘Register’ link
     * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Navigate to Register page Successfully", expectedText, actualText);
    }

    /*
    userShouldRegisterAccountSuccessfully *
click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration
completed’
     */

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailID = "User" + userName + "@example.com";
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Manini");
        driver.findElement(By.name("LastName")).sendKeys("Sheth");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("9");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("6");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");
        driver.findElement(By.id("Email")).sendKeys("Prime456@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime123");
        driver.findElement(By.id("register-button")).click();
        String expectedMessage = "Your registration completed"; // this is from requirement
        String actualMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        Assert.assertEquals("User Register Successfully", expectedMessage, actualMessage);


    }


    @After

    public void tearDown() {
        // closeBrowser();
    }


}
