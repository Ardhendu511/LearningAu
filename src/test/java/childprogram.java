import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class childprogram extends mainclass{ 
	String url="";   
	 @Test(priority = 1)
   public void testSearchmobile() throws InterruptedException {   
		 configfile config = new configfile(); 
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80)); 
		 String searchmobile=config.getProperty("searchmobile");
       WebElement Searchelement=driver.findElement(By.xpath(searchmobile));   
       Searchelement.sendKeys("Mobile"+ Keys.ENTER);   
       String getcurrenturl=driver.getCurrentUrl();   
       String url1=getcurrenturl; 
       System.out.print("hi");

   } 
   @Test(priority = 2)
   public void dropdownvalue() throws InterruptedException
   {    
   	configfile config = new configfile(); 
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80)); 
   	String clickdropdown=config.getProperty("clickdrop-down");
          WebElement dropdownclick=driver.findElement(By.xpath(clickdropdown));
          dropdownclick.click();  
          List<WebElement>dropdownvalue=dropdownclick.findElements(By.tagName("option"));
          for(int i=0; i<dropdownvalue.size(); i++)
          { 
       	    dropdownvalue.get(0).click();    
          }    
          String seconddropdown=config.getProperty("Seconddropdown");
          WebElement dropdownclick1=driver.findElement(By.xpath(seconddropdown));
          dropdownclick1.click(); 
          List<WebElement>dropdownvalue2=dropdownclick1.findElements(By.tagName("option"));  
          for(int i=0; i<dropdownvalue2.size(); i++)
          {
       	   dropdownvalue2.get(0).click();   
          } 
          String searchmobile=config.getProperty("mobilevalue");
          WebElement searchelement=driver.findElement(By.xpath(searchmobile)); 
          searchelement.sendKeys("Samsung"+Keys.ENTER); 
          String choosesamsungvalue=config.getProperty("choosesamsung");
          WebElement tapsamsung=driver.findElement(By.xpath(choosesamsungvalue));
          tapsamsung.click(); 
          Assert.assertEquals("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&p%5B%5D=facets.price_range.from%3D10000&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG", "https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&p%5B%5D=facets.price_range.from%3D10000&p%5B%5D=facets.price_range.to%3D20000&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG"); 
          System.out.println("Test cases is working as excepted"); 
          
   }
   @Test(priority = 3)
   public void clickproduct() throws InterruptedException
   {   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
   	configfile config = new configfile(); 
   	String choosefirstmobile=config.getProperty("clickonfirstvalue");
   	WebElement tapmobile=driver.findElement(By.xpath(choosefirstmobile)); 
   	Thread.sleep(1000);
   	tapmobile.click();
   	System.out.println(driver.getTitle());
   	System.out.println(" I have reach here");
   	  String mainWindow = driver.getWindowHandle();
   	    Set<String> allWindows = driver.getWindowHandles();
   	    for (String window : allWindows) { 
   	    	
   	        if (!window.equals(mainWindow)) { 
   	        	Thread.sleep(1000);
   	        	
   	            driver.switchTo().window(window); 
   	            Thread.sleep(1000);
   	            break;
   	        }
   	    } 
   	    String listmobile=config.getProperty("listvalue");
   	    
   	    List<WebElement> listproduct=driver.findElements(By.xpath(listmobile)); 
   	    
   	    System.out.println("All the list value is"+listproduct.size());  
   	    
   	    for(int i=0; i<listproduct.size(); i++)
   	    { 
   	    	
   	    	 listproduct.get(i).click(); 
   	    	
   	    	 if(i==4) {  
   	    		 Thread.sleep(1000);
   	    		 WebElement Clickdropvalue=driver.findElement(By.xpath("//div[@class='B-Odya _6gf9Ot']")); 
   	    		 Thread.sleep(1000);
   	    		 Clickdropvalue.click();
   	    	 }
   	    }  
   	    JavascriptExecutor js = (JavascriptExecutor) driver;

           // Scroll down by 300 pixels
           js.executeScript("window.scrollBy(0,300)"); 
           String addcarttocard=config.getProperty("addtocart");
   	    WebElement addtocart=driver.findElement(By.xpath(addcarttocard));
   	    addtocart.click(); 
//   	    driver.navigate().back(); 
   	    
   	    
   }  
   @Test(priority = 4)
   public void homepage() throws InterruptedException
   {  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
   	configfile config = new configfile();
   	String additem=config.getProperty("Additemvalue");
   	WebElement Additem=driver.findElement(By.xpath(additem));  
   	Additem.click();
       System.out.print("I have reach here");  
   }


}
