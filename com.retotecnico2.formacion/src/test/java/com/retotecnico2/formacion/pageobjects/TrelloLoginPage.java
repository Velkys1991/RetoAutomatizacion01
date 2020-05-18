package com.retotecnico2.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/es/signup")

public class TrelloLoginPage extends PageObject {
	
	// Campo correo electronico
				@FindBy(xpath= "//*[@id='email']")
				public WebElementFacade txtCorreoelectronico;

			// Boton Continuar
				@FindBy(xpath="//*[@id='signup-submit']")
				public WebElementFacade btnContinuar;
				
			// Label Registrarse  a verificar
				@FindBy(xpath= "//*[@id='root']/div/div/div/div[2]/div[2]/div/section/div[1]/h5")
				public WebElementFacade lblRegistarse;
				
			public void IngresarDatos(String strcorreoelectronico) {
				txtCorreoelectronico.sendKeys(strcorreoelectronico);
				btnContinuar.click();

			}

			public void VerificaRegistrarse() {
				String labelv = "Regístrate para obtener tu cuenta";
				String strMensaje = lblRegistarse.getText();
				assertThat(strMensaje, containsString(labelv));
			}
			
			}

		


