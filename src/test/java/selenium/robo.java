package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robo {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		//to maximize 
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("email"));
		
		Actions act = new Actions (driver) ; 
		act.sendKeys(e, "kazhthepoodle").perform();
		
		act.doubleClick().build().perform();
		
		act.contextClick().build().perform(); 
		
		Robot robo = new Robot ()  ; 
		
		for (int i=0 ; i<= 1; i++) {
		
		robo.keyPress(KeyEvent.VK_DOWN); 
		robo.keyRelease(KeyEvent.VK_DOWN); 
		
		}
		robo.keyPress(KeyEvent.VK_ENTER); 
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
	


}

}