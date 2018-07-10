package Paquete1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetPruebas {

	CP1 prueba1 = new CP1();
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\AAAD4474\\Downloads\\Sel-3.12\\chromedriver.exe");

	}

	@Test
	public void login() {
		String password = "m0t0rama";
		boolean resultado = prueba1.login("gaby_alecit_@hotmail.com", password);
		prueba1.cerrar();
		System.out.println(resultado);
		assertEquals(true, resultado);

	}

	@Test
	public void descargar() {
		String password = "m0t0rama";
		boolean resultado = prueba1.login("gaby_alecit_@hotmail.com", password);
		prueba1.descargar("idURL_2");
		prueba1.cerrar();
		System.out.println(resultado);
		assertEquals(true, resultado);

	}

}