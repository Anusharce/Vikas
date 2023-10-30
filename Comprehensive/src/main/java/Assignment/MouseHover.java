package Assignment;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class MouseHover {

	    public static void main(String[] args) {
	        // Create a ChromeDriver object
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the Automation Anywhere website
	        driver.get("https://www.automationanywhere.com/");
	        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

	        // Mouse over the Products menu
	        WebElement ele=driver.findElement(By.xpath("//a[text()='Products']"));
	        Actions act=new Actions(driver);
	        act.moveToElement(ele).perform();

	        // Click on the Process Discovery link
	        driver.findElement(By.xpath("(//a[contains(text(),'Discovery')])[1]")).click();

	        // Verify that the current URL is the Process Discovery page
	        String currentUrl = driver.getCurrentUrl();
	        if (!currentUrl.equals("https://www.automationanywhere.com/products/process-discovery")) {
	            System.out.println("Test failed! Current URL is not the Process Discovery page.");
	        } else {
	            System.out.println("Test passed!");
	        }

	        // Close the browser
	        driver.quit();
	    }
	
}
