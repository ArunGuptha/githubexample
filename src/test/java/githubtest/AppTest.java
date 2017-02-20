package githubtest;

import org.testng.annotations.Test;

import github.Login1;
import github.WebDriverFactory;

public class AppTest 
{
	@Test
	public void test() throws InterruptedException{
		
		Login1 test=new Login1();
		WebDriverFactory init= new WebDriverFactory();
		init.initializewebdriver();
		test.Abc();
		init.teardown();
	}
	
}
