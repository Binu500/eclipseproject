package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); //to launch chromebrowser
		driver.get("https://www.google.com");// to launch application
		String actualtitle= driver.getTitle();
		String exp="google";
		
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}