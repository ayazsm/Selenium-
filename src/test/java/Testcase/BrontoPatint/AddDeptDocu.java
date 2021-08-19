package Testcase.BrontoPatint;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddDeptDocu {


WebDriver driver;
@Test(priority=1)
public void HomePage() throws IOException
{
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


driver.get("http://codetru.cloud/");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
System.out.println("Navigated to DigitalTrust");


driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


driver.findElement(By.xpath("//input[@value='Login as User']")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


System.out.println("Click on Settings");
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/ul/li[3]")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


System.out.println("Enter department Name");
driver.findElement(By.name("dept_name")).sendKeys("group");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


System.out.println("Click on Add button");
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div[2]/div/div/div/div/button")).click();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


System.out.println("Click on Delete Svg");

//driver.findElement(By.xpath("//*[@id=\"departments\"]/tbody/tr[6]/td[3]/a/i/svg/path")).click();
//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

//driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/button[2]")).click();
//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

}
}