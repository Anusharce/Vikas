package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG extends BaseClass{

   

    @Test
    public void verifyProductsPage() {

    	 driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

        // Mouse over the Products menu
        WebElement ele=driver.findElement(By.xpath("//a[text()='Products']"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).perform();

        // Click on Process Discovery
        driver.findElement(By.xpath("(//a[contains(text(),'Discovery')])[1]")).click();

        // Verify that the page navigates to the following URL
        String expectedUrl = "https://www.automationanywhere.com/products/process-discovery";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test
    public void verifyRequestDemoPage() throws InterruptedException {

    	
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(2000);

        // Click on Request Demo button
        driver.findElement(By.xpath("(//a[contains(@class,'orange')])[2]")).click();

        // Verify that the page navigates to the following URL
        String expectedUrl = "https://www.automationanywhere.com/request-live-demo";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        // Verify the Label Names for First Name and Last Name
        String firstNameLabel = driver.findElement(By.xpath("//*[@id=\"LblFirstName\"]")).getText();
        String lastNameLabel = driver.findElement(By.xpath("//*[@id=\"LblLastName\"]")).getText();
        Assert.assertEquals(firstNameLabel, "*First Name");
        Assert.assertEquals(lastNameLabel, "*Last Name");


    }
}
