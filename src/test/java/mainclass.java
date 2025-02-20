

//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainclass extends configfile {   
	@SuppressWarnings("deprecation")
	//@BeforeClass
	WebDriver driver;  
	@BeforeClass
	public void beforeClass()  { 
		configfile config = new configfile(); 
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();  // Initialize driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String url = config.getProperty("mainurl");  
        System.out.println(url);
        driver.get(url);  
        System.out.print("hi how are you");
		
	}
	  
	@AfterClass
    public void afterClass() { 
        if (driver != null) {
            driver.quit();
        }
    }

}
