package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchPizza_Test {
	@Test
	public void pizza() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/?src=google_sem_brand&utm_source=google&utm_medium=cpc&utm_campaign=Brand-PanIndia-MOB-Exact-2017-S-Bangalore&gad_source=1&gclid=CjwKCAiAzc2tBhA6EiwArv-i6YsfjLTpDNi3-Jyk_OD4PRlDlTjQ4sfHNYR7mHhPXQF3ZV4MJx4OmxoCisgQAvD_BwE");
		driver.quit();
	}
}
