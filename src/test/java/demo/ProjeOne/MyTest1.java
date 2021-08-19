package demo.ProjeOne;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class MyTest1 {
	@Test
//	public void myTest() {
//		
//		int a =90;
//		int b =90;
//		
//		
//		Assert.assertEquals(a, b);
//		System.out.println("============Test Done==========");
//		
//	}
//	@BeforeClass
//	public void beforeClass() {
//		
//		System.out.println("======Starting the Test========");
//	}

	@AfterClass
	public void afterClass() throws EmailException {
	

		SendEmail.sendEmail();
	}

}
