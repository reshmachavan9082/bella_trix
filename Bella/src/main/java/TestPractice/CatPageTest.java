package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class CatPageTest {

	public void cartPageVerification() {

		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://demos.bellatrix.solutions/");
		
		driver.manage().window().maximize();
		
		driver.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.cssSelector("")).click();

		driver.findElement(By.cssSelector("a.added_to_cart.wc-forward")).click();
	}

}
