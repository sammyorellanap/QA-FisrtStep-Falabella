package com.edu.eam.pruebasdeaceptacionAlvaro.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class NoPreguntasAutoEvalStepsDefinitions {

	WebDriver controlador;

	@Given("^Abrimos el navegador y vamos al sitio web no ver preguntas de autoevaluacion$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_no_ver_preguntas_de_autoevaluacion() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\ALVARO JAVIER L S\\Desktop\\Universidad\\Semestre 7\\Desarrollo en equipo\\corte 3\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\chromedriver.exe");
		controlador = new ChromeDriver();
		controlador.manage().window().maximize();
		controlador.get("http://localhost:8090/EvaluacionDocenteEAM-1.0.0/XHTML/respuestaCoevaluacion.faces");
	}

	@Then("^El usuario deberia ver el mensaje \"([^\"]*)\" para saber que no hay preguntas$")
	public void el_usuario_deberia_ver_el_mensaje_para_saber_que_no_hay_preguntas(String mensaje) throws Throwable {
		String respuesta = controlador.findElement(By.id("formDialog:j_idt15_data")).getText();
		controlador.close();
		Assert.assertEquals(respuesta, mensaje); 
	}

}
