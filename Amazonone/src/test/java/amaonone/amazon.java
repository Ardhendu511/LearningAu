package amaonone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon {  
	//@SuppressWarnings("unlikely-arg-type")
	@Test(priority=1)
	public void browserlucnh() throws InterruptedException {  
		try {
		ChromeDriver  driver=new ChromeDriver(); 
		FirefoxDriver driver2=new FirefoxDriver(); 
		EdgeDriver driver3=new EdgeDriver();
		if(driver.equals("ChromeDriver")) 
		{
			 driver.get("https://reqres.in/api/users/4"); 
			 Thread.sleep(10000);
		} 
		else if (driver2.equals("FirefoxDriver")) { 
			driver.get("https://fb.com/"); 
			Thread.sleep(1000);
			
		} 
		else if (driver2.equals("EdgeDriver")) { 
			Thread.sleep(1000); 
			driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=5309772937618817027&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1"); 
			
		} {
			
		}
		}
		
		
		catch (Exception e) {
			System.out.print(e);
		}
	    
		
			
		}
		
	
}
