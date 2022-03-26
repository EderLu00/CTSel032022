package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		String exePath = "./driver/chromedriver.exe";  //especificar la ruta del Chrome driver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();  //Objeto de WebDriver
		driver.get("https://www.google.com.mx");

	}

}
