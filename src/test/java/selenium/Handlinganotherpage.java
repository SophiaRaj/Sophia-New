package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlinganotherpage {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh(); 
		WebElement E = driver.findElement(By.id("twotabsearchtextbox"));
	     E.sendKeys("airpods" , Keys.ENTER);
	     
	     String parentwindow = driver.getWindowHandle();
	     Set<String> childwindow = driver.getWindowHandles();
	    	System.out.println(parentwindow);	
	    	System.out.println(childwindow);

	    	for(String x : childwindow) {
	    		if(! parentwindow.equals(x)) {
	    			driver.switchTo().window(x);
	    		}
	    		
	    	}
	    	
	    	driver.findElement(By.xpath("//*[contains (text(), 'Apple Wired ')]")).click(); 
	    WebElement e =  driver.findElement(By.name("submit.add-to-cart"));
	    String text =  e.getText() ; 
	   System.out.println(text); 
	     
		

	}

}
