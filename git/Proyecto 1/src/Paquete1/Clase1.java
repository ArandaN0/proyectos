package Paquete1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clase1 {
	public boolean test(){
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\AAAD4474\\Downloads\\Sel-3.12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Crea el objeto waitVar1 para realizar la espera explicita
		WebDriverWait waitVar1 = new WebDriverWait(driver, 10);
		driver.get("http://www.liverpool.com.mx");
		System.out.println("title of page is: " + driver.getTitle());
		driver.findElement(By.id("login_btn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(2);
		driver.findElement(By.id("login")).sendKeys("gaby_alecit_@hotmail.com");
		// System.out.println(driver.getPageSource());

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("m0t0rama");
		// System.out.println(driver.getPageSource());
		driver.findElement(By.id("lp_loginFormBtn")).click();

		driver.switchTo().frame(0);
		WebElement elemento1 = driver.findElement(By.id("creditoURL_ak"));
		elemento1.click();

		driver.findElement(By.xpath("(//a[contains(text(),'Estado de cuenta')])[3]")).click();
		driver.findElement(By.cssSelector("#mesesAnteriores_li > div.customRadio > label")).click();

		driver.findElement(By.id("selectMesesAnteriores")).click();

		// Crea el objeto selectBox para poder elegir la opción meses anteriores
		final Select selectBox = new Select(driver.findElement(By.id("selectMesesAnteriores")));
		selectBox.selectByValue("idURL_4");
		// manda a llamar el método until

		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("downloading_statemnt")));
		driver.findElement(By.id("downloading_statemnt")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(10000);
			
		} catch (IllegalMonitorStateException e) {
			e.printStackTrace();
			System.out.println("Error 0");
			return false;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error 1");
			return false;
		} finally {
			//System.out.println("Marquesitas 2x100$");
			driver.close();
		}
		return true;
		// driver.quit(); // usando QUIT todas las ventanas se cerrarán
		// System.exit(0);
	}
}