package Githubdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class githubDemo {
	
static WebDriver driver;
	
	@Test
	
	public void testJenkins(){
		
		System.out.println("Welcome Jenkins");
		
	
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		// Login 		 
	     driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	     driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Vikas.yadav@gmail.com");
	 	 driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("Demo123");
	 	 driver.findElement(By.id("SubmitLogin")).click();
	 	 driver.findElement(By.className("logout")).click();	
		 driver.close();
		
		 System.out.println("Login Successful");
		
		
		
	
	
	}

}
