package com.retotecnico2.formacion.steps;

import com.retotecnico2.formacion.pageobjects.TrelloLoginPage;

import net.thucydides.core.annotations.Step;

public class TrelloValidationSteps {
	
		TrelloLoginPage trellologinPage;
		
	
		@Step
		public void login_trello(String strcorreoelectronico) {
//	    a. Abrir Navegador con la url de prueba
			trellologinPage.open();
	/*    b. Ingresar correoelectronico
	      c. Click en botón Continuar */
			trellologinPage.IngresarDatos(strcorreoelectronico);
//	    d. Verificar la autenticación (label Registarse)
			trellologinPage.VerificaRegistrarse();
		}
		
		
	}


