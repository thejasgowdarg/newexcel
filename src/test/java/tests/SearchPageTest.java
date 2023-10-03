package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import pages.SearchPage;
import util.Utilities;

public class SearchPageTest extends Base{
	
	public LoginPage lgn;
	public Utilities utl;
	public SearchPage srch;
	public String sheetname="Sheet2";
	
	
	SearchPageTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws Exception {
		launchBrowser();
		lgn=new LoginPage();
		utl=new Utilities();
		srch=new SearchPage();
		lgn.loggiiins(prop.getProperty("fenancialyear"), prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	@DataProvider(name ="data")
	public Object[][] getData(){
		Object data[][]=utl.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "data")
	public void searh(String branchcode) throws Exception {
		srch.seareeees(branchcode);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
