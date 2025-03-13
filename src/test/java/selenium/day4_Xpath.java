package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class day4_Xpath {

	public static void main(String[] args) {
		
		//Selector hub/dev tools -plugin-add to the chrome extension- to find out xpath/css selector
		// XML path or xpath is an address of an element
		//It works based on the DOM-document object model
		//two types- Absolute Xpath(Full xpath-/) and Relative xpath(Partial xpath-//)
		//Absolute Example- /html/body/div[6]/div[1]/div[2]/div[2]/form/input >> created from root html node>>body>>header>div tags
		//Relative Example-//*[@id="small-searchterms"]>> from the current working node>> works on attributes
		//Which xpath is preferred- relative xpath- since the when dev team tries to change the DOM -traversing becomes tideous in absolute xpath where as
		//relative xpath directly jumps to the webelement in the DOM and points to the attributes
		//Performance vice both are same
		//syntax- Relative xpath- //tagname or *[@atribute='value']
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		  //Xpath with single attribute
		  driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys
		  ("Tshirts");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		  
		  //Xpath with multiple attributes 
		  driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).
		  sendKeys("Pants");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		  
		  //Xpath with '&' and and or '||' 
		  driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).
		  sendKeys("skirts");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		  
		  driver.findElement(By.
		  xpath("//input[@placeholder='Search store' or @id='small-searchterms']")).
		  sendKeys("pants and skirts");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		  
		  //<h3>desktops</h3> --->> inner text //<a href= "https://us.com"> Click me</a>----> Link text //all inner text cannot be a text
		  
		  driver.findElement(By.xpath("//a[text()='Computers '] ")).click();
		  
		  Boolean value=
		  driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed()
		  ; System.out.println(value);
		  
		  String value1
		  =driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
		  System.out.println(value1);
		  
		  //contains() method //start-with() method //above methods are used for finding web elements having dynamic attributes
		  
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).
		  sendKeys("Shirts");
		  
		  driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).
		  sendKeys("Shirts");
		  
		  driver.findElement(By.xpath("//input[contains(text,'Sear')]")).  sendKeys("Shirts");
		  
		  //chained xpath example- //div[@class='header-logo']/a/img ---> main tag and then use absolute xpath by using main element tag and name
		  
		  
		  
		  driver.quit();
		 
		
	}

}
