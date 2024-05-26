package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/\n";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    /*userShouldNavigateToComputerPageSuccessfully
     * click on the ‘Computers’ Tab
     * Verify the text ‘Computers’
     */
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computerTabElement = driver.findElement(By.linkText("Computers"));
        computerTabElement.click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("Navigate To Computer Page Successfully", expectedText, actualText);
    }

    /*
    userShouldNavigateToElectronicsPageSuccessfully
 * click on the ‘Electronics’ Tab
 * Verify the text ‘Electronics’

     */
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicTabElement = driver.findElement(By.linkText("Electronics"));
        electronicTabElement.click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("Navigate to Electronics page Successfully", expectedText, actualText);
    }

   /*
    userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’
    */

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelTabElement = driver.findElement(By.linkText("Apparel"));
        apparelTabElement.click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals("Navigate to Apparel page Successfully", expectedText, actualText);
    }

    /*
    userShouldNavigateToDigitalDownloadsPageSuccessfully
    * click on the ‘Digital downloads’ Tab
    * Verify the text ‘Digital downloads’

     */
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals("Navigate to Digital downloads page Successfully", expectedText, actualText);

    }

    /*
    userShouldNavigateToBooksPageSuccessfully
* click on the ‘Books’ Tab
* Verify the text ‘Books’
     */

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement book = driver.findElement(By.linkText("Books"));
        book.click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("Navigate to Book page successfully", expectedText, actualText);
    }

    /*
    userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
     */

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("Navigate to Jewelry page successfully", expectedText, actualText);

    }

    /*
    userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’

     */
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCards = driver.findElement(By.linkText("Gift Cards"));
        giftCards.click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("Navigate to Gift Cards page successfully", expectedText, actualText);
    }

    @After

    public void tearDown() {
        closeBrowser();
    }

}
