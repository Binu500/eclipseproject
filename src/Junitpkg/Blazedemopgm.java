package Junitpkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemopgm {

	ChromeDriver cd;
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		cd=new ChromeDriver();
		cd.get("https://www.blazedemo.com/register");
	}
	
	@test
	
}
