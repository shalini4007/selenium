package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_WebdriverMethods {

	public static void main(String[] args) {
		// Get methods>> Conditional methods>> browser methods>> navigation methods >>wait methods

		//Get Methods--> we can access these methods through webdriver instance
		//get(URL)- opens URL on the browser
		//getTitle()-returns title of the page
		//getCurrentURL()- returns URL of the page
		//getPageSource()- returns source code of the page
		//getWindowHandle()- returns ID(unique ID is available during run time) of the single browser windows
		//getWindowHandles()- returns IDs of the multiple browser windows
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(" Title od the page is: " + driver.getTitle());
		System.out.println(" Current URL is: "+ driver.getCurrentUrl());
		System.out.println("Page source code is: "+ driver.getPageSource());
		System.out.println("First Browser window Id is: "+ driver.getWindowHandle());
		
		driver.findElement(By.linkText("YouTube")).click();// new browser window
		
		Set<String> BothWindowIds= driver.getWindowHandles();
		System.out.println("Both Browser window Id are: "+BothWindowIds);
		
		//browser methods- quit()-multiple windows and close()- current working wndow
		driver.quit();
		}

}
