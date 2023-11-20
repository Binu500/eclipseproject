package Junitpkg;

import java.net.HttpURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgmcount {
String baseurl="https://www.ebay.com";
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test1()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		   System.out.println("total no of links="+li.size());
		   
		   for(WebElement element:li)
		   {
			   String link=element.getAttribute("href");
			   verifylink(link);
		   }
		
	}
private void verifylink(String link) {
	try
	{
		URL u = new URL(link);
		HttpURLConnection con=
	}
}


}
