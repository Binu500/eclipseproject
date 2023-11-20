package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void Googlesearch()
	{
		driver.findElement(By.name("q")).sendKeys("cricket");
		driver.findElement(By.name("btnK")).click();
		
	}
}
