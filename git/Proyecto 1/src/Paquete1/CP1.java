package Paquete1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CP1 {
	// Este atributo es el mismo para todas las instancias de la clase Login
	// (static)
	WebDriver driver = new ChromeDriver();
	WebDriverWait waitVar1;
	

	// constructor para inicializar los atributos "WebDriver"
	public CP1() {
		waitVar1= new WebDriverWait(driver, 50);
	}

	public boolean login(String usuario, String password) {

		
		driver.get("http://www.liverpool.com.mx");
		driver.findElement(By.id("login_btn")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		driver.switchTo().frame(2);
		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
		driver.findElement(By.id("login")).sendKeys(usuario);
		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.id("lp_loginFormBtn")).click();
		
		
		return true;
	}

	public void descargar(String opcion) {

		driver.switchTo().frame(0);
		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("creditoURL_ak")));
		WebElement elemento1 = driver.findElement(By.id("creditoURL_ak"));
		elemento1.click();

		driver.findElement(By.xpath("(//a[contains(text(),'Estado de cuenta')])[3]")).click();
		driver.findElement(By.cssSelector("#mesesAnteriores_li > div.customRadio > label")).click();
		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("selectMesesAnteriores")));
		//driver.findElement(By.id("selectMesesAnteriores")).click();

		// Crea el objeto selectBox para poder elegir la opción meses anteriores
		final Select selectBox = new Select(driver.findElement(By.id("selectMesesAnteriores")));
		selectBox.selectByValue(opcion);
		driver.findElement(By.id("downloading_statemnt")).click();
		
	}

	public void cerrar() {
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getPageSource());
		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
		//driver.findElement(By.id("firstNameCut_ak")).click();
		driver.findElement(By.id("login")).click();
		//waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_href_ak")));
		driver.findElement(By.partialLinkText("Cerrar")).click();
		waitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
		driver.close();

	}
}
