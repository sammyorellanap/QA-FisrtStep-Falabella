package com.edu.eam.pruebasdeaceptacion.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FalabellaStepsDefinition {
	
	WebDriver controlador;
	
	@Given("^Abrimos el navegador google y se escribe la palabra a buscar \"([^\"]*)\"\\. Se presiona en el texto que dice falabella\\.com - Mejor Comprar Online$")
	public void abrimos_el_navegador_google_y_se_escribe_la_palabra_a_buscar_Se_presiona_en_el_texto_que_dice_falabella_com_Mejor_Comprar_Online(String arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "\\Users\\luis.ramirez.donoso\\eclipse-workspace\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\chromedriver");
	    controlador=new ChromeDriver();
	    controlador.manage().window().maximize();
	    controlador.get("http://www.google.com/");
	    controlador.findElement(By.id("lst_ib")).sendKeys("palabra");
	    controlador.findElement(By.id("btnk")).click();
	    controlador.findElement(By.linkText("https://www.falabella.com/falabella-cl/")).click();
	}

	@When("^el usuario busca un producto \"([^\"]*)\" para comprar\\. Luego presiona el producto para ver detalle\\. Finalmente se hace click en Bolsa de productos$")
	public void el_usuario_busca_un_producto_para_comprar_Luego_presiona_el_producto_para_ver_detalle_Finalmente_se_hace_click_en_Bolsa_de_productos(String arg1) throws Throwable {
		controlador.findElement(By.id("searchQuestionsSolr")).sendKeys("producto");
		controlador.findElement(By.linkText("smart tv")).click();
		controlador.findElement(By.linkText("https://www.falabella.com/falabella-cl/product/5895268/LED-55-55MU6500-4K-Ultra-HD-Smart-TV-Curvo/5895268")).click();
		controlador.findElement(By.tagName("button.fb-btn.fb-btn-primary.fb-product-cta__controls--actions--choose")).click();
		
	}

	@When("^el usuario presiona el boton de bolsa, aumenta a (\\d+) productos, agrega garantia extendida de (\\d+) años$")
	public void el_usuario_presiona_el_boton_de_bolsa_aumenta_a_productos_agrega_garantia_extendida_de_años(int arg1, int arg2) throws Throwable {
		controlador.findElement(By.linkText("/falabella-cl/basket")).click();
		controlador.findElement(By.tagName("button.fb-quantity-input__plus")).click();
		controlador.findElement(By.tagName("a.fb-inline-dropdown__link.js-inline-dropdown__link")).click();
		controlador.findElement(By.partialLinkText("2 años $ 79.990")).click();
		
	   	}

	@Then("^el usuario presiona el botón ir a comprar$")
	public void el_usuario_presiona_el_botón_ir_a_comprar() throws Throwable {
		controlador.findElement(By.tagName("button.fb-btn.fb-btn-primary.fb-btn-icon.fb-order-status__continue-purchase.js-fb-continue-purchase")).click();
		
	}


}


