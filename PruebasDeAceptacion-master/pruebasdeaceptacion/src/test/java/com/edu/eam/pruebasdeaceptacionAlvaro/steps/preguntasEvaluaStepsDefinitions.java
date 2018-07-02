package com.edu.eam.pruebasdeaceptacionAlvaro.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class preguntasEvaluaStepsDefinitions {

	WebDriver controlador; 

	@Given("^Abrimos el navegador y vamos al sitio web ver preguntas evaluacion$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_ver_preguntas_evaluacion() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\ALVARO JAVIER L S\\Desktop\\Universidad\\Semestre 7\\Desarrollo en equipo\\corte 3\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\chromedriver.exe");
		controlador = new ChromeDriver();
		controlador.manage().window().maximize();
		controlador.get("http://localhost:8090/EvaluacionDocenteEAM-1.0.0/XHTML/respuestaEvaluacion.faces");
	}

	@Then("^El usuario deberia ver el mensaje \"([^\"]*)\"$")
	public void el_usuario_deberia_ver_el_mensaje(String mensaje) throws Throwable {
		String respuesta = controlador.findElement(By.id("formDialog:j_idt16:0:preguntaEv")).getText();
		controlador.close();
		Assert.assertEquals(respuesta, mensaje);
	}

}
