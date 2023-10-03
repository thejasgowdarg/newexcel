package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.DeductionPage;
import pages.LoginPage;
import pages.MasterNonEmp;
import pages.SearchPage;
import util.Utilities;




public class DeductionPageTest extends Base{
	
	public LoginPage lgn;
	public Utilities util;
	public SearchPage srch;
	public DeductionPage dps;
	public MasterNonEmp mrp;
	public String sheetname="Sheet4";
	
	DeductionPageTest(){
		super();
	}
	
	@BeforeClass
	public void SetUp() throws Exception {
		launchBrowser();
		lgn=new LoginPage();
		util=new Utilities();
		srch=new SearchPage();
		mrp=new MasterNonEmp();
		dps=new DeductionPage();
		lgn.loggiiins(prop.getProperty("fenancialyear"), prop.getProperty("username"),prop.getProperty("password"));
		srch.seareeees(prop.getProperty("bcode"));
		
	
	
	
	}
	
	
	
	
	@DataProvider(name="data")
	public Object[][] getDeducteData(){
		Object data[][]=util.excelData(sheetname);
		return data;
	}
	@Test(priority =1, dataProvider = "data")
	public void deeeede(String Name,String Section,String Date,String IncomeTax) throws Exception {
		dps.deeeeee(Name, Section, IncomeTax, Date);
	}
	@AfterClass
	public void TearDown() {
		driver.close();
	}

}



