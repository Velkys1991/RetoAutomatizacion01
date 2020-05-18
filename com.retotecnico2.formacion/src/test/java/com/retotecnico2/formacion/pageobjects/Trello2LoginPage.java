package com.retotecnico2.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://trello.com/login")
public class Trello2LoginPage extends PageObject {
	
	        // Campo User
				@FindBy(xpath= "//*[@id='user']")
				public WebElementFacade txtUser;

			// Campo Password
			   @FindBy(xpath="//*[@id='password']")
				public WebElementFacade txtPassword;
			   
			// Boton Login
				@FindBy(xpath="//*[@id='login']")
				public WebElementFacade btnLogIn;
				
							
			public void IngresarDatos(String User, String Password) {
				txtUser.sendKeys(User);
				txtPassword.sendKeys(Password);
				btnLogIn.click();

			}


}
