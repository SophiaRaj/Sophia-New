package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
public static void main(String[] args) {
		
	//using action class 
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); 
	
	driver.get(" https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=678719109054&hvpos=&hvnetw=g&hvrand=8234427730033379696&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-362216169274&hydadcr=5620_2412619&gad_source=1");
	driver.navigate().refresh();
	WebElement element = driver.findElement(By.xpath("//span[text()='Account & Lists']")); 
	Actions act = new Actions (driver) ; 
	act.moveToElement(element).build().perform();
	
	act.doubleClick().build().perform();
	
	driver.findElement(By.id("ap_email")).sendKeys("rsof1997@gmail.com");
	act.contextClick().build().perform(); 
	}
}
