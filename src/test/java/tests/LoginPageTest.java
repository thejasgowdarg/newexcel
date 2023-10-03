package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import util.Utilities;

public class LoginPageTest extends Base{
	
	public LoginPage lgn;
	public Utilities utl;
	public String sheetname="Sheet1";
	
	LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void SetUp() {
		launchBrowser();
		lgn=new LoginPage();
		utl=new Utilities();
		
	}
	
	@DataProvider(name ="getExcelTestData")
	public Object[][] getExcelTestData() {
		Object data[][]=utl.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "getExcelTestData")
	public void login(String fenancialyear,String username,String password) throws Exception {
		lgn.loggiiins(fenancialyear, username, password);
		Thread.sleep(2000);
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
