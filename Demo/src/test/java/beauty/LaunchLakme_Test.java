package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLakme_Test {
	@Test
	public void lakme() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/?utm_source=google&utm_medium=cpc&utm_campaign=PUB_Lakme-Colours_Google_DTC_Search_Brand_NA_Sales_NA_Overall_23rdJan2024&utm_content=Brand_Exact&utm_term=lakme&gad_source=1&gclid=Cj0KCQiAzoeuBhDqARIsAMdH14FpWp5SWYLRFLGAhihNaoJrsouYvD6Ff3VnqM72KuHfB4iH86Ew9DsaAtvsEALw_wcB");
		driver.quit();
	}
}
