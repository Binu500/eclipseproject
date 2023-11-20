package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgm {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		

	}
	
	@Test
	public void test() {
		JavascriptExecutor js = ( JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();

	}
	
	
	
}
