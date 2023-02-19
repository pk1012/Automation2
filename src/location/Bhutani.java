package location;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bhutani
{
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome file\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://realtyassistant.in/properties");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();

		WebElement location=driver.findElement(By.xpath("//select[@id='cities']"));

		Select s=new Select(location);

		s.selectByVisibleText("Noida");

		WebElement category = driver.findElement(By.xpath("//select[@id='category']"));

		Select s1 = new Select(category);

		s1.selectByIndex(4);

		WebElement status=driver.findElement(By.xpath("//select[@id='status']"));

		Select s2 = new Select(status);

		s2.selectByValue("New Launch");

		WebElement search = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		search.click();

		driver.close();


	}


}
