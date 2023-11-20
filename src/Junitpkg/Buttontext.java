package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");;
	}
	
	@Test
	public void test1()
	{
		String buttontext =driver.findElement(By.xpath("//input[@id='Register']")).getAttribute("value");
		if(buttontext.equals("Create my account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
