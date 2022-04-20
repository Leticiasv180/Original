package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	
	//driver.findelement(By.id ("passava elemento")). click;
	
		WebDriver driver;
		private String texto; 
		
		public void clicar (By elemento) {
			
			driver.findElement(elemento).click(); 
		}
		
		public void preencher (By elemento, String texto) {
			
			driver.findElement(elemento).sendKeys("texto");
		}
		
		public void pausa (int tempo) throws InterruptedException {
			
			Thread.sleep(tempo);
			
		}
		
		public void validartexto (String texto, By elemento) {
			
			String mensagem = driver.findElement(elemento).getText();
			System.out.println(mensagem);
			assertEquals("texto", "mensagem");
			
		}
		public void pegartexto (By elemento) {

			String texto = driver.findElement(elemento).getText();
			System.out.println(texto);
		
		}

		public void executarNavegador(String url) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window ().maximize(); 
		}

		public String getTexto() {
			return texto;
		}
	
}
	
	

