package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		//single iframe 
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("viky");
         Thread.sleep(2000);
         //switching to nested iframe 
         
         driver.navigate().to("https://www.dezlearn.com/nested-iframes-example/");
         driver.navigate().refresh();
         driver.switchTo().frame("Parent iframe");
         driver.findElement(By.id("u_5_5")).click();
         
         //driver.findElement(By.xpath("//input[@type='text']")).click();
        
	}

}
