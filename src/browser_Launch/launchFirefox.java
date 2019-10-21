package browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "F:\\firefox.log");

WebDriver driver= new FirefoxDriver();

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
String title;
title= driver.getTitle();
System.out.println(title);
		
		
	}

}
