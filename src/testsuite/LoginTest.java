package testsuite;


import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/\n";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    /*
    userShouldNavigateToLoginPageSuccessfully *
    click on the ‘Login’ link
    * Verify the text ‘Welcome, Please Sign
    In!’
     */

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement((By.xpath("//h1")));
        String actualText = welcomeTextElement.getText(); // store element
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }

    /*
    userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc123@gmail.com");
        // find the password field and type the password into password field
        driver.findElement(By.name("Password")).sendKeys("abc123");
        //Find Login  element and click
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    String expectedMessage = "Log out";
    String actualMessage = driver.findElement(By.xpath("//a[text()= 'Log out']")).getText();
    Assert.assertEquals("User is not login successfully",expectedMessage,actualMessage);}


/*
verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
Please correct the errors and try again. No customer account found
 */

     @Test
        public void verifyTheErrorMessage(){
         // find the Login link and click on login link element
         WebElement loginLink = driver.findElement(By.linkText("Log in"));
         loginLink.click();
         //find the email field element and type the email address to email field
         WebElement emailField = driver.findElement(By.id("Email"));
         emailField.sendKeys("Prime123@gmail.com");
         // find the password field and type the password into password field
         driver.findElement(By.name("Password")).sendKeys("Prime123");
         //Find Login btn element and click
         driver.findElement(By.xpath("//button[text()='Log in']")).click();

         String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                 "No customer account found";

         String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();//once u used get text it become string element
         Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }



}