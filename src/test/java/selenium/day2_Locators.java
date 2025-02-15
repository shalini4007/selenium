package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Locators {
	
	//Locators///
	//Locators are used to identify web elements uniquely from UI
	//basic Locators--> id, name, LinkText/partialLinkText, classname, tagName
	//Customized Locators---> 1) CSS selectors(-->tag & Id-->tag & class-->tag & attribute--> tag, class & attribute
	//Customized Locators---> 2) Xpath--> Absolute xpath and Relative xpath
	//Purpose of basic and customized locators is same
	
	//anchor tag<a> always represents link with href(hyper link reference) attribute and anchor tag has href and class attribute and Link text
	//Partial link text is not preferred since there might be multiple values present with the same name
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logo_display=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo_display);	
		
		//anchor tag<a> always represents link with href(hyper link reference) attribute and anchor tag has href and class attribute and Link text
		//Partial link text is not preferred since there might be multiple values present with the same name
		//linkText and partialLinkText
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tablet"));
		
		//findElement-retrieves single specific element-return type is WebElement- 
		//tag Name and class name-findElements -retrieves multiple/group of web elements not specific web elements-return type is List<WebElement>
		//example- to get total number of links/images etc present in the page- we go for tag name or class name
		//if the locator is not matching with any of the WebElements- returns- No such Element Exception
		//if the locator is not matching any of the WebElements- returns Zero- does not throw any exception 
		
		List<WebElement> headerLinks= driver.findElements(By.className("list-inline"));
		System.out.println("Total  number of header links: "+ headerLinks.size());
		
		//tagName as a locator to get group of locators
		

		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total  number of links in a webpage: "+ totalLinks.size());
		
		//total number of images in a web page
		
		List<WebElement> totalimages=driver.findElements(By.tagName("img"));
		System.out.println("Total  number of images in a webpage: "+ totalimages.size());
		
		
		
		
		driver.quit();
		
		
		
		
	
		
	}

}
