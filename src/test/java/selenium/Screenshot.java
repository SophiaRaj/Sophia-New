package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.co.in/");
         
		TakesScreenshot t = (TakesScreenshot)driver ; 
		File take = t.getScreenshotAs(OutputType.FILE);
		File save = new File ("C:\\Users\\ASUS\\Desktop\\MYJAVA\\google.png"); 
		FileUtils.copyFile(take, save);
	}

}
