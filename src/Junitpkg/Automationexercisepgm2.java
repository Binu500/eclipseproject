package Junitpkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexercisepgm2 {

ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
	}
	
	@Test
	
}

