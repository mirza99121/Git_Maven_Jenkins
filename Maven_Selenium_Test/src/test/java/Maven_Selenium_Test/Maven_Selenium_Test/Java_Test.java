package Maven_Selenium_Test.Maven_Selenium_Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Test {

	public static void main(String[] args) {

		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button. Code Update #3  
        driver.findElement(By.linkText("Core Java")).click();   
        
	}

}
