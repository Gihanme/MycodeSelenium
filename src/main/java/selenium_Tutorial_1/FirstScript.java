package selenium_Tutorial_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScript {
	@Test
	public void testSearch() throws InterruptedException{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\Windos\\chromedriver_win32 (2)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.lk");
		
		
		WebElement googlesearch = driver.findElement(By.id("lst-ib"));
		googlesearch.sendKeys("Restaurant");
		
		WebElement Google = driver.findElement(By.xpath("//input[@value='Google Search']"));
		Google.click();
		Thread.sleep(1000);
		
		//WebElement Wikipedia = driver.findElement(By.linkText("Restaurant - Wikipedia"));
		//Wikipedia.click();
		
		WebElement Wiki =driver.findElement(By.xpath("//h3[contains(text(),'Restaurant - Wikipedia')]"));
		Wiki.click();
		//driver.close();
		//driver.quit();
		
	}
	
}
