package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaypgm {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[name='_nkw']")).sendKeys("mobiles",Keys.ENTER);
		
	}

}
