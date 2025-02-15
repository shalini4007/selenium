package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_CSSLocators {

	public static void main(String[] args) {
		//CSS-cascading style sheets
		//tag id>>>>   tag#id
		//tag class>>>>  tag.classname-->group of elements and single elements
		//tag attribute>>>>  tag[attribute="value"]
		//tag class attribute>>>>  tag.classname[attribute="value"]- one specific elements
		//selectorhubs- external plugin>> Is visible when inspected 
		//Inspect the element and right click- copy-css selector or xpath

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirts");//tag id>>>>   tag#id
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("pants"); //tag class>>>>  tag.classname 
		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("tops");//tag attribute>>>> tag[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("shirts");//tag class attribute>>>>  tag.classname[attribute="value"]
		
		
		driver.quit();
		
	}

}
