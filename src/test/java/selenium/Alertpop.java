package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpop {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert popup = driver.switchTo().alert(); 
		
		popup.sendKeys("sophia");
		
		popup.accept();

	}

}
