package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		
		Select daydetails=new Select(day);
		daydetails.selectByValue("02");
		List<WebElement> cl=daydetails.getOptions();
		System.out.println("day count="+cl.size());
		
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select monthdetails=new Select(day);
		monthdetails.selectByValue("03");
		List<WebElement> c2=monthdetails.getOptions();
		System.out.println("month count="+c2.size());
		
		
	}

	
	
}
