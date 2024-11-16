package selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class chrome {

	@Test
	public void logintest() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		driver.findElement(By.name("signon")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
