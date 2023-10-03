package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.DeductionPage;
import pages.LoginPage;
import pages.MasterNonEmp;
import pages.SearchPage;
import util.Utilities;

public class MasterNonEmpTest extends Base{
	
	public LoginPage lgn;
	public Utilities utl;
	public SearchPage srch;
	public MasterNonEmp mrp;
	public String sheetname="Sheet3";
	
	MasterNonEmpTest(){
		super();
	}
	
	@BeforeClass
	public void SetUp() throws Exception {
		launchBrowser();
		lgn=new LoginPage();
		utl=new Utilities();
		srch=new SearchPage();
		mrp=new MasterNonEmp();
		lgn.loggiiins(prop.getProperty("fenancialyear"), prop.getProperty("username"),prop.getProperty("password"));
		srch.seareeees(prop.getProperty("bcode"));
	}
	
	@DataProvider(name="data")
	public Object[][] getData(){
		 Object data[][]=utl.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "data")
	public void master(String name,String state,String custmerid,String pan) throws Exception {
		mrp.masteeeee(name, state, custmerid, pan);
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
