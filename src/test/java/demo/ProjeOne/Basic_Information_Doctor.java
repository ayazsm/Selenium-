package demo.ProjeOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Information_Doctor {
	WebDriver driver;
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Reporter.log("ChromeBrowser got launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://bronto-frontend.codetru.cloud/#/doctorSignUp/profileForm");            
		driver.findElement(By.name("userName")).sendKeys("Ayaz");
		driver.findElement(By.name("firstName")).sendKeys("mhd");
		driver.findElement(By.name("lastName")).sendKeys("bro");
		//driver.findElement(By.name("email")).sendKeys("cabajoy575@obxstorm.com");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[1]/div/div/div[3]/div[5]/div[2]/div/div/input")).sendKeys("8899776655");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[1]/div/div/div[3]/div[6]/div[2]/div/svg")).click();	
		//driver.findElement(By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[1]/text()")).sendKeys("Male");
	}
}
//*[@id="root"]/div/div[1]/div/div/div[1]/div/div/div[3]/div[1]/div[2]/div/div/input