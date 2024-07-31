package testpackage;

import org.testng.annotations.Test;

import basepackage.magnetobase;
import pagepackage.magnetopage;
import utilities.excelmagneto;

public class magnetotest extends magnetobase
{

	@Test
	public void test1() throws InterruptedException
	{
		magnetopage m1=new magnetopage();
	    String pg = "C:\\Users\\user\\OneDrive\\Desktop\\magneto.xlsx";
	    String sheet="Sheet1";
	    int rowCount=utilitiespackage.excelmagneto.getrowcount(pg, sheet);
	    for(int i=1;i<=rowCount;i++)
	    {
	    	String email=utilitiespackage.excelmagneto.getcellvalue(pg, sheet, i, 0);
	    	System.out.println("USERNAME="+email);
	    	String password=utilitiespackage.excelmagneto.getcellvalue(pg, sheet, i, 1);
	    	System.out.println("PASSWORD="+password);
	    	
	    	Thread.sleep(2000);
	    	m1.login(email, password);
	    	m1.addproduct();
	    	m1.cart();
	    }
	}
	
	
	
	
}
