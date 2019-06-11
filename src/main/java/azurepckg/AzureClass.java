package azurepckg;

import org.testng.Assert;
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
<<<<<<< HEAD
		 System.out.println("Kudoooos");
		 Assert.assertEquals(true, false);
=======
		 System.out.println("Kuddoooooooos");
>>>>>>> branch 'master' of https://github.com/PallabitaJena/AzureTest2.git
		 softAssert.assertAll();


	}

}
