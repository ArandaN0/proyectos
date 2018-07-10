package Paquete1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clase3 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\AAAD4474\\Downloads\\Sel-3.12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;
		Thread.sleep(1000);
		try {
			Thread.sleep(10000);

			// extract the link texts of each link element
			for (WebElement e : linkElements) {
				linkTexts[i] = e.getText();
				i++;
			}

			// test each link
			for (String t : linkTexts) {
				driver.findElement(By.linkText(t)).click();
				if (driver.getTitle().equals(underConsTitle)) {
					System.out.println("\"" + t + "\"" + " is under construction.");
				} else {
					System.out.println("\"" + t + "\"" + " is working.");
				}

			}

			driver.navigate().back();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			System.out.println("Error1");
		} finally {
			driver.quit();

		}
	}
}