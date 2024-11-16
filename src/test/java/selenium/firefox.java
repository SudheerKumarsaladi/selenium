package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class firefox {
	
	@Test
	public void test() throws InterruptedException
	{

		WebDriver driver = new EdgeDriver();
		driver.get("https:/google.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
