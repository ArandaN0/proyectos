package Paquete1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clase3 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/link.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\AAAD4474\\Downloads\\Sel-3.12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("Title of page is: " + driver.getTitle());
		Thread.sleep(10000);
		
		driver.quit();

	}

}
