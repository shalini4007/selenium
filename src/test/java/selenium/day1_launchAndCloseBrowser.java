package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class day1_launchAndCloseBrowser {

	public static void main(String[] args) {
		
		//launch the browser--> Chrome
		
		//ChromeDriver driver= new ChromeDriver();--> done by constructor available in Chrome driver class
		WebDriver driver= new ChromeDriver();//WebDriver is a parent 
		
		//Open the URL
		driver.get("https://www.cricbuzz.com/");
		
		//Get the Title of the page
		String act_title=driver.getTitle();
		System.out.println(act_title);	
if(act_title.equals("Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com"))
{
	System.out.println("Test Passed");
}
else
{
	System.out.println("Test Failed");
	
}

		//Closing the current working browser
		driver.close();
		//driver.quit();

	}

}
