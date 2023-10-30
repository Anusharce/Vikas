package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RequestDemo {

	public static void main(String[] args) {
		// Create a ChromeDriver object
        WebDriver driver = new ChromeDriver();

        // Navigate to the Automation Anywhere website
        driver.get("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

        // Click on the Process Discovery link
        driver.findElement(By.xpath("(//a[contains(@class,'orange')])[2]")).click();

        // Verify that the current URL is the Process Discovery page
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.equals("https://www.automationanywhere.com/request-live-demo"))
        {
            System.out.println("Test failed! Current URL is not the Process Discovery page.");
        } else {
            System.out.println("Current URL Verified");
        }
      String FName=driver.findElement(By.xpath("//*[@id=\"LblFirstName\"]")).getText();
      if(!FName.equals("*First Name"))
      {
    	  System.out.println("First Name label not Verified");
      }
      else
      {
    	  System.out.println("First Name label Verified");

      }
      String LName=driver.findElement(By.xpath("//*[@id=\"LblLastName\"]")).getText();
      if(!LName.equals("*Last Name"))
      {
    	  System.out.println("Last Name label not Verified");
      }
      else
      {
    	  System.out.println("Last Name label Verified");

      }
        // Close the browser
        driver.quit();
    }




	}


