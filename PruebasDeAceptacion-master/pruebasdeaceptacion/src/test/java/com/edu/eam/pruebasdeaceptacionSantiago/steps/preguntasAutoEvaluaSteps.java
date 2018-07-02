package com.edu.eam.pruebasdeaceptacionSantiago.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class preguntasAutoEvaluaSteps {

	WebDriver controlador;
	
	

	@Given("^Abrimos el navegador y vamos al sitio web del login$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_del_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jefry\\git\\PruebasDeAceptacion\\pruebasdeaceptacion\\drivers\\chromedriver.exe");
	    controlador= new ChromeDriver();
	    controlador.manage().window().maximize();
	    controlador.get("http://localhost:8089/EvaluacionDocenteEAM-1.0.0/XHTML/respuestaAutoEvaluacion.faces");
	}

	@Then("^El usuario deberia ver las preguntas \"([^\"]*)\" al final$")
	public void el_usuario_deberia_ver_las_preguntas_al_final(String pregunta) throws Throwable {
		String resultado = controlador.findElement(By.id("formDialog:j_idt16:0:preguntaAutoE")).getText();
		controlador.close();  
		
		
		Assert.assertEquals(resultado, pregunta);
	}

}