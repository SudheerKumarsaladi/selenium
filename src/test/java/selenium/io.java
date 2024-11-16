package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class io {
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
	}

}
