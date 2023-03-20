package tasks;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//To maximize automated chrome window
		driver.manage().window().maximize();
		
		//Launching the given URL
		driver.get("https://blazedemo.com/");
		
		//To Find Number of images
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		
		int total = image.size();
		
		System.out.println("Number of images: "+total);
		
		//To find number of links
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int t = link.size();
		
		System.out.println("Number of links: "+t);
		
		//To validate the Title web page
		
		String  actualTitle = driver.getTitle();
		
		String ExpectedTitle = "BlazeDemo";
		
		if (actualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Title Matched");
		}
		
		else
		{
			System.out.println("Title didn't Matched");
		}
		
		
		//By clicking home button, we can go to login page
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a[3]")).click();
		
		driver.findElement(By.tagName("a"));
		
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[2]/a")).click();
		driver.navigate().refresh();

		//Give inputs to register into blazedemo
		Scanner myobj = new Scanner(System.in);
		{
		System.out.println("Enter the username:");
		String name = myobj.nextLine();
		driver.findElement(By.id("name")).sendKeys(name);
		}
		driver.findElement(By.id("company")).sendKeys("skill-lnc");
		driver.findElement(By.id("email")).sendKeys("Sakthi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sakthi@123");
		driver.findElement(By.id("password-confirm")).sendKeys("Sakthi@123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();
		
		System.out.println("The Registration is Unsuccessful");
		driver.navigate().refresh();
		
		//To login the website
		
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("Sakti@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sakthi@123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		
		System.out.println("login unsuccessful");
		driver.navigate().refresh();
		
		
		driver.close();
		
		
		}
	}


