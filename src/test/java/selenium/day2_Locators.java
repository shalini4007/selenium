package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Locators {
	
	//Locators///
	//Locators are used to identify web elements uniquely from UI
	//basic Locators--> id, name, LinkText/partialLinkText, classname, tagName
	//Customized Locators---> 1) CSS selectors(-->tag & Id-->tag & class-->tag & attribute--> tag, class & attribute
	//Customized Locators---> 2) Xpath--> Absolute xpath and Relative xpath
	//Purpose of basic and customized locators is same
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ixigo.com/");
	driver.manage().window().maximize();
	
		
	}

}
