package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/rio/login");
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"ssoDefault\"]/div/div/div/div[2]/div[2]/div[1]/div[2]/div/a"));
		((WebElement) driver).click();
		uploadElement.sendKeys("C:\\Demo");
		driver.findElement(By.id("pop_upload")).click();
	}

}
