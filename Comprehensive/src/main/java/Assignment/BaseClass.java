package Assignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public RemoteWebDriver driver;


	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver(); 



		driver.manage().window().maximize();
		driver.get("https://www.automationanywhere.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();


	}





}


