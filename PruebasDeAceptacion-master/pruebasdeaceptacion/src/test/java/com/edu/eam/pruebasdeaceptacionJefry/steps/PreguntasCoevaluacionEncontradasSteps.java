/**
 * 
 */
package com.edu.eam.pruebasdeaceptacionJefry.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Jefry Londoño <jjmb2789@gmail.com>
 * @26/10/2016
 * @version
 */
public class PreguntasCoevaluacionEncontradasSteps {
	
	
	WebDriver controlador;
	
	

	@Given("^Abrimos el navegador y vamos al sitio web respuesta Coevaluacion$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_respuesta_Coevaluacion() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Jefry\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    controlador= new ChromeDriver();
	    controlador.manage().window().maximize();
	    controlador.get("http://localhost:8089/EvaluacionDocenteEAM-1.0.0/XHTML/respuestaCoevaluacion.faces");
	}

	@Then("^El usuario debera ver la pregunta \"([^\"]*)\" en el sitio web$")
	public void el_usuario_debera_ver_la_pregunta_en_el_sitio_web(String mensaje) throws Throwable {
		String resultado = controlador.findElement(By.id("formDialog:j_idt15:0:preguntaEv")).getText();
		controlador.close();
		
		Assert.assertEquals(resultado, mensaje);
	}
	
	
}
