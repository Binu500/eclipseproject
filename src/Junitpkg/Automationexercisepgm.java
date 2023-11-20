package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexercisepgm {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Binu Thomas");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("binuthomasabraham@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	}

}
