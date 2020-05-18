package com.retotecnico2.formacion.steps;

import com.retotecnico2.formacion.pageobjects.Trello2LoginPage;

import net.thucydides.core.annotations.Step;

public class Trello2ValidationSteps {
	
	Trello2LoginPage trello2loginPage;
	
	@Step
	public void login_trello(String User,String Password) {
//    a. Abrir Navegador con la url de prueba
		trello2loginPage.open();
/*    b. b. Ingresar usuario 
      c. Ingresar password 
      d. Click en botón Sign in*/
       trello2loginPage.IngresarDatos(User,Password);

	
	}
}
