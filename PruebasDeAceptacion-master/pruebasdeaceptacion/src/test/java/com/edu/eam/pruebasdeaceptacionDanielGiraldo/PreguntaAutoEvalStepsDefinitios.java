/**
 * 
 */
package com.edu.eam.pruebasdeaceptacionDanielGiraldo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Daniel Giraldo <pipe_635@hotmail.com>
 *
 */
public class PreguntaAutoEvalStepsDefinitios {

	WebDriver controlador;



@Given("^Abrimos el navegador y vamos al sitio web de preguntas$")
public void abrimos_el_navegador_y_vamos_al_sitio_web_de_preguntas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Daniel Giraldo\\Music\\CORTE 3\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\chromedriver.exe");
	controlador = new ChromeDriver();
	controlador.manage().window().maximize();
	controlador.get("http://localhost:8085/EvaluacionDocenteEAM-1.0.0/XHTML/evaluacionAutoevaluacion.faces");

}

@When("^El usuario ingrese el estado \"([^\"]*)\", la pregunta \"([^\"]*)\" y el periodo academico \"([^\"]*)\"$")
public void el_usuario_ingrese_el_estado_la_pregunta_y_el_periodo_academico(String estado, String pregunta, String periodo) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 controlador.findElement(By.id("estado")).sendKeys(estado);  
	 controlador.findElement(By.id("pregunta")).sendKeys(pregunta);  
	 controlador.findElement(By.id("periodo")).sendKeys(periodo);  

}
@When("^el usuario precione el boton guardar$")
public void el_usuario_precione_el_boton_guardar() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 controlador.findElement(By.id("btnSave")).click();
	 Thread.sleep(2000);
	
}


@Then("^el usuario debea ver el mensaje \"([^\"]*)\"$")
public void el_usuario_debea_ver_el_mensaje(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String resultado= controlador.findElement(By.id("msg")).getText();

}

}
