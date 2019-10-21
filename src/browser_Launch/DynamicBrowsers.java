package browser_Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DynamicBrowsers {
// Module 11, 4
	public static void main(String[] args) {
		String browser = "Chrome";// xls, xml
		WebDriver driver = null;
		// script
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			driver = new ChromeDriver();
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
		}else if(browser.equals("Edge")){
			driver = new EdgeDriver();
		}
		
		// common functions
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		
		
		//driver.quit();
		
		

	}

}
