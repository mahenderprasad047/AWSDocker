package UnitTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AWS_LaunchBrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		cap.setCapability("browserVersion", "119.0");
		cap.setCapability("platformName", "linux");
		cap.merge(opt);
		//driver = new ChromeDriver(opt);
		WebDriver driver = new RemoteWebDriver(new URL("http://13.53.214.6:4444/wd/hub"),cap);
		Thread.sleep(10000);
		driver.quit();

	}

}
