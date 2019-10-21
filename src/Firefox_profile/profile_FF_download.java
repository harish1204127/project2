package Firefox_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class profile_FF_download {

	public static void main(String[] args) {
		//http://kb.mozillazine.org/Category:Preferences
System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
FirefoxProfile profile = new FirefoxProfile();






profile.setPreference("browser.startup.homepage","https://www.mozilla.org/en-US/foundation/documents");
FirefoxOptions options = new FirefoxOptions();
options.setProfile(profile);
options.addPreference("browser.download.folderList", 2);
options.addPreference("browser.download.dir", "F:\\Selenium\\drivers");
options.addPreference("browser.download.useDownloadDir", true);
options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
//	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword,application/x-rar-compressed,application/octet-stream,application/csv,text/csv");
options.addPreference("pdfjs.disabled", true);  // disable the built-in PDF viewer

FirefoxDriver driver = new FirefoxDriver(options);
driver.findElement(By.linkText("IRS Form 872-C")).click();

		
		
	}

}
