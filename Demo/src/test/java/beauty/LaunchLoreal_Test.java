package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLoreal_Test {
	@Test
	public void loreal() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/products/?brand=l-oreal-paris&category=serums-essence&gad_source=1&gclid=Cj0KCQiAzoeuBhDqARIsAMdH14Gc3LIvXnQ_8CrfivqZCuVoUmcaiS92ylwoB6xCZEKRftKPuEnTFlcaAijQEALw_wcB");
		driver.quit();
	}
}
