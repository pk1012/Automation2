package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserOpening 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Velocity\\0 Notes\\2. Automation\\4. Selenium\\chromedriver_win32\\chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
	}
}
