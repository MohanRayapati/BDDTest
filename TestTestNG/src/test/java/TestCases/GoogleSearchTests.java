package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageMethods.GoogleSearchMethods;

public class GoogleSearchTests {

		GoogleSearchMethods gsm = new GoogleSearchMethods();
		@BeforeMethod
		public void beforeMethod()
		{
			gsm.launch_the_url();
		}
		
		@Test
		public void test1() throws InterruptedException
		{
			gsm.enter_text_in_google_search_box();
		}
		
		@Test
		public void test2()
		{
			gsm.get_the_title_and_print();
		}
		
		@AfterMethod
		public void afterMethod()
		{
			gsm.close_the_browser();
		}
		

	}

