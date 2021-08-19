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

public class BrontoDoctorLogin {
	WebDriver driver;
	@Test
	public void demotest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Reporter.log("ChromeBrowser got launched");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://bronto-frontend.codetru.cloud/#/home");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/div/div[4]/div/button")).click();	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[4]/div/div/div/p[2]")).click();	
		driver.findElement(By.name("name")).sendKeys("Ayaz");
		driver.findElement(By.name("email")).sendKeys("kodimo5130@obxstorm.com");
		driver.findElement(By.name("password")).sendKeys("Codetrue");
		driver.findElement(By.name("mobile")).sendKeys("7207605808");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[4]/div[2]/button/span[1]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[5]/div/div/div/p[1]")).isDisplayed());
		//Take Screenshot at this place 
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\">Screenshot2</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\ProjeOne\\screenshots\\screenshot1.png\"/>");
		
	}

}

//<p class="MuiTypography-root jss110 jss104 jss93 MuiTypography-body1">Click here to signup now</p>

//*[@id="root"]/div/div/div[2]/header/div/div/div[2]/button

//https://onedrive.live.com/about/en-us/signin/
