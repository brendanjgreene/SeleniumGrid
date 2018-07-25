import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remoteTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//DesiredCapabilities
		// star hub command on brendangreene:>$ java -jar selenium-server-standalone-3.12.0.jar -role hub

		// start nod command on brendangreene/eclipse-workspace:>$ java -Dwebdriver.chrome.driver="chromedriver" -Dwebdriver.gecko.driver="geckodriver" -jar selenium-server-standalone-3.12.0.jar -role webdriver -hub http://192.168.1.5:4444/grid/register -port 5566
		String browser = "chrome";//firefox or chrome
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setBrowserName(browser);
		dc.setPlatform(Platform.MAC);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444/wd/hub"), dc);
		driver.get("http://reddit.com");
		System.out.println(driver.getTitle());
		Thread.sleep(30000);
		driver.close();
		
	}

}
