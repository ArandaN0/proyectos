package Paquete1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Descargar {

	static WebDriver driver = new ChromeDriver();
	
	public boolean test2(String usuario, String password) {
	
		driver.switchTo().frame(0);
		
		WebElement elemento1 = driver.findElement(By.id("creditoURL_ak"));
		elemento1.click();

		driver.findElement(By.xpath("(//a[contains(text(),'Estado de cuenta')])[3]")).click();
		driver.findElement(By.cssSelector("#mesesAnteriores_li > div.customRadio > label")).click();

		driver.findElement(By.id("selectMesesAnteriores")).click();

		// Crea el objeto selectBox para poder elegir la opción meses anteriores
		final Select selectBox = new Select(driver.findElement(By.id("selectMesesAnteriores")));
		selectBox.selectByValue("idURL_4");
		driver.close();
		return false;

		//assertEquals(true, resultado);

	}

}
