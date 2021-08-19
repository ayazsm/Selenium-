package demo.ProjeOne;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Demo 
{
	
	WebDriver driver;
	@Test
	public void demoTest() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Reporter.log("ChromeBrowsergotlaunched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		
		driver.get("http://bronto-frontend.codetru.cloud/#/home");
		Reporter.log("Bronto Home Page opened");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined jss83 jss79']//span[@class='MuiButton-label']")).click();
		
		
		//Navigate to the application
	
		//driver.get("http://bronto-frontend.codetru.cloud/#/doctorLogin");
		Reporter.log("Navigated to Doctor's login page of the application");
		driver.manage().window().maximize();
		
		
		//Take Screenshot at this place 
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/h5")).isDisplayed());
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("screenshots//screenshot2.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot2.png\">Screenshot2</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot2.png\"/>");
		
		
		Reporter.log("Enter Correct email");
		driver.findElement(By.name("email")).sendKeys("jawiki2058@1uscare.com");
		Reporter.log("Enter Correct password");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("div[class='MuiBox-root jss713'] p[class='MuiTypography-root jss92 MuiTypography-body1']")).isDisplayed());
		//Take Screenshot at this place 
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\">Screenshot1</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\"/>");
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > button:nth-child(2) > span:nth-child(1) > svg:nth-child(1)")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Logout']")).click();
				
	}
	
	
//	@Test
//	public void Demo2() throws IOException {
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//p[normalize-space()='Total Patients']")).isDisplayed());
//		//Take Screenshot at this place 
//		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\">Screenshot1</a>");
//		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\"/>");
//		//driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > button:nth-child(2) > span:nth-child(1) > svg:nth-child(1)")).click();
//		
//	}
//	
	
}
