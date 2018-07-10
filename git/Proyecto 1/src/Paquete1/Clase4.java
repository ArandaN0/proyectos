package Paquete1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clase4 {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/block.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\AAAD4474\\Downloads\\Sel-3.12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}it5066'8jghol6rivrugncjycbxcgjfddriberhhñtyyhgrudjg54epk{_.ZZSDFswsdf56tjk85hidb6 iiiiiiiiiiiiii55uklt6riyfujttf