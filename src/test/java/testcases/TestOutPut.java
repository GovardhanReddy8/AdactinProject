package testcases;

import org.testng.annotations.Test;

import pages.BasePage;

public class TestOutPut extends BasePage{
	@Test
	public void firstTest() throws Exception {
		TestCaseOne ts = new TestCaseOne(driver);
		ts.login();
		ts.warUmsg();
		Thread.sleep(2000);
		
		ts.username("Govardhan");
		ts.login();
		ts.warPmsg();
		Thread.sleep(2000);
		
		ts.password("govardhan123");
		ts.login();
		ts.Logmsg();
		Thread.sleep(2000);
		System.out.println();
		
		
	}

}
