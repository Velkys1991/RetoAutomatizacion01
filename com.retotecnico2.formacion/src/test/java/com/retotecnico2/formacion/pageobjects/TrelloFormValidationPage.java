package com.retotecnico2.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrelloFormValidationPage extends PageObject {
	

// Campo Nombre_Completo
	@FindBy(id="displayName")   
	public WebElementFacade txtNombre;

// Campo Crear_Contraseña
	@FindBy(id="password")
	public WebElementFacade txtContraseña;
		
// Boton Registrarse
	@FindBy(id="signup-submit")
	public WebElementFacade BtnSingup;
	
// Mensaje Bienvenido
	@FindBy(id="969ce2c6-6831-495f-9b55-505e1d91dba6")
	public WebElementFacade Bienvenido;
	


public void Nombre_Completo(String datoPrueba) {
txtNombre.click();
txtNombre.clear();
txtNombre.sendKeys(datoPrueba);
}

public void Crear_Contraseña(String datoPrueba) {
txtContraseña.click();
txtContraseña.clear();
txtContraseña.sendKeys(datoPrueba);
}

public void Boton_Registarse() {
BtnSingup.click();

}

public void form_sin_errores() {
	assertThat(Bienvenido.isCurrentlyVisible(), is(false));

}

}



