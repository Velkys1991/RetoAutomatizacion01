package com.reto.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject{
	
	        // Campo Required
				@FindBy(id="required2")   
				public WebElementFacade txtRequired;

			// Campo Email
				@FindBy(id="email")
				public WebElementFacade txtEmail;
				
	
			// Campo Password 1
				@FindBy(id="password2")
				public WebElementFacade txtPass1;
				
			// Campo Password 2
				@FindBy(id="confirm_password2")
				public WebElementFacade txtPass2;
				
			// Campo Date
				@FindBy(id="date2")
				public WebElementFacade txtDate;
				
				
			// Campo Url
				@FindBy(id="url2']")
				public WebElementFacade txtUrl;
						
			// Campo Digits Only
				@FindBy(id="digits")
				public WebElementFacade txtDigitOnly;
				
		    // Campo Range
				@FindBy(id="range")
				public WebElementFacade txtRang;
				
			// Select Agree
				@FindBy(id="agree2")
				public WebElementFacade CheckAgree;
				
			// Boton Validate
				@FindBy(id="block-validate")
				public WebElementFacade BtnValidate;
				
			
		    // Error Carga
				@FindBy(id="required2-error")
				public WebElementFacade ErrorCarga;
				
				
		public void Required(String datoPrueba) {
			txtRequired.click();
			txtRequired.clear();
			txtRequired.sendKeys(datoPrueba);
		}
		
		public void Email(String datoPrueba) {
			txtEmail.click();
			txtEmail.clear();
			txtEmail.sendKeys(datoPrueba);
		}
		
		public void Password1(String datoPrueba) {
			txtPass1.click();
			txtPass1.clear();
			txtPass1.sendKeys(datoPrueba);
		}
		
		public void Password2(String datoPrueba) {
			txtPass2.click();
			txtPass2.clear();
			txtPass2.sendKeys(datoPrueba);
		}
		
		public void Date(String datoPrueba) {
			txtDate.click();
			txtDate.clear();
			txtDate.sendKeys(datoPrueba);
		}
		
		
		public void Url(String datoPrueba) {
			txtUrl.click();
			txtUrl.clear();
			txtUrl.sendKeys(datoPrueba);
		}
		
		
	     public void Digits_Only(String datoPrueba) {
			txtDigitOnly.click();
			txtDigitOnly.clear();
			txtDigitOnly.sendKeys(datoPrueba);
		}
		
		public void Range(String datoPrueba) {
			txtRang.click();
			txtRang.clear();
			txtRang.sendKeys(datoPrueba);
		}
		
		public void Select_Agree() {
			CheckAgree.click();
		}
		
		
		public void Boton_Validate() {
			BtnValidate.click();
			
		}
		
		public void form_sin_errores() {
			assertThat(ErrorCarga.isCurrentlyVisible(), is(false));
			
		}
		
		public void form_con_errores() {
			assertThat(ErrorCarga.isCurrentlyVisible(), is(true));
				
			}
				

}
