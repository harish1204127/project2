package Firefox_profile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class profile_start_google {

	public static void main(String[] args) {
		//http://kb.mozillazine.org/Category:Preferences
System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
FirefoxProfile profile = new FirefoxProfile();
profile.setPreference("browser.startup.homepage","http://www.google.com");
FirefoxOptions options = new FirefoxOptions();
options.setProfile(profile);
FirefoxDriver driver = new FirefoxDriver(options);
String title;
title= driver.getTitle();
System.out.println(title);
		
		
	}

}
