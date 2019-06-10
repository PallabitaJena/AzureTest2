package azurepckg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AzureClass {
	public SoftAssert softAssert;

	@Test
	public void method1()
	{
		System.out.println("Kuddoooooooos");
		 softAssert=new SoftAssert();
		 softAssert.assertEquals("Hello","Hi");
		 System.out.println("Kuddoooooooos");
		 softAssert.assertAll();


	}

}
