package Testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {

ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	
    @Test
	public void test()
	{
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act =new Actions(driver);
		act.moveToElement(electronics).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[3]/div[1]/img")));
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[3]/div[1]/img")).click();
		
	}
}
