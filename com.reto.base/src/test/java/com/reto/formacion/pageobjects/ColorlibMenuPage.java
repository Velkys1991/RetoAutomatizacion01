package com.reto.formacion.pageobjects;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject{
	
	// Menu Forms
				@FindBy(id="menu")
				public WebElementFacade MenuForms ;

	// Submenu Form General
			   @FindBy(id="menu")
				public WebElementFacade MenuFormGeneral ;
			   
	// Submenu Form Validation
				@FindBy(id="menu")
				public WebElementFacade MenuFormValidation  ;
				
	// Form Validation - Label Informativo
				@FindBy(id="content")
				public WebElementFacade LblFormValidation;
				
				
public void menuFormValidation() {
	MenuForms.click();
	MenuFormValidation.click();
	String strMensaje = LblFormValidation.getText();
	assertThat(strMensaje,containsString("Block Validation"));
	
}
}
