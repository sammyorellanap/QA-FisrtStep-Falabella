package com.edu.eam.pruebasdeaceptacionSantiago.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class noPreguntasEvaluaSteps {

	WebDriver controlador;
	
	@Given("^Abrimos el navegador y vamos al sitio web donde se deberian cargar las preguntas$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_donde_se_deberian_cargar_las_preguntas() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jefry\\git\\PruebasDeAceptacion\\pruebasdeaceptacion\\drivers\\chromedriver.exe");
		    controlador= new ChromeDriver();
		    controlador.manage().window().maximize();
		    controlador.get("http://localhost:8089/EvaluacionDocenteEAM-1.0.0/XHTML/respuestaEvaluacion.faces");
	}

	@Then("^El usuario deberia ver el siguente \"([^\"]*)\" el cual dice que no hay registros$")
	public void el_usuario_deberia_ver_el_siguente_el_cual_dice_que_no_hay_registros(String mensaje) throws Throwable {
		String resultado = controlador.findElement(By.id("formDialog:j_idt16_data")).getText();
		controlador.close();
		
		Assert.assertEquals(resultado, mensaje);
	}  


	
}
