package engine;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driverconfiguration {
	/*
	 * To create Chrome driver Add more options/capabilities to the driver as
	 * required
	 */
	private static final Logger LOGGER = Logger.getLogger(Driverconfiguration.class);
	public static WebDriver createchromedriver() {
		LOGGER.info("In Driverconfiguration");
		// System.setProperty("webdriver.chrome.driver",
		// ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("incognito");
		options.addArguments("start-maximized");
		return new ChromeDriver(options);

	}
	/*
	 * To create IE driver
	 */

	public WebDriver createIEdriver() {
		System.setProperty("webdriver.ie.driver", "drivers\\IEdriver");
		return new InternetExplorerDriver();
	}

	/*
	 * To create remote driver
	 */

	public RemoteWebDriver createChromeDriverForRemote() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("start-maximized");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
		capabilities.setCapability(CapabilityType.PLATFORM_NAME, "WINDOWS 10");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return new RemoteWebDriver(new URL("http://XXX.X.X.X:XXXX"), capabilities);

		// In case you want to run your test in remote machine, create your driver here
		// For saucelabs - Use your machine IP,port and saucelabs key to establish a
		// connection and create a url

	}

}
