package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.trivago.com/");
	}
	
	@Test
	public void datepicker()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div/button[2]/span/span[2]/span[2]"));
		datepickermethod("December 2023","23");
	datepickermethod("December 2024","30");	
		
	}

	private void datepickermethod(String expmonth, String expdate) {
		while(true)
		{
			
		}
		
		
	}

}
