package com.retotecnico2.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Trello2FormValidationPage extends PageObject {
	
	
	// Menu Tableros
		@FindBy(id="header")   
		public WebElementFacade Tableros;

	// Submenu Crear Tablero
		@FindBy(id="chrome-container")
		public WebElementFacade CrearTablero;
			
	// Name Tablero
		@FindBy(id="layer-manager-overlay")
		public WebElementFacade txtName;
		
	// Boton Crear 
		@FindBy(id="layer-manager-overlay")
		public WebElementFacade btnCrear;
		
		// Verificación Tablero 
				@FindBy(id="content")  
				public WebElementFacade Verificacion;
		


	public void Menu_Tableros() {
		Tableros.click();
	
	}
	
	public void Submenu_Tablero() {
		CrearTablero.click();
	
	}

	public void Name_Tablero(String datoPrueba) {
		txtName.click();
		txtName.clear();
		txtName.sendKeys(datoPrueba);
	}

	public void Boton_Crear() {
		btnCrear.click();

	}

	public void form_sin_errores() {
	assertThat(Verificacion.isCurrentlyVisible(), is(false));
}
}
