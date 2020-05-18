package com.reto.formacion.steps;

import com.reto.formacion.pageobjects.ColorlibLoginPage;
import com.reto.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class BlockValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	
	
	@Step
	public void login_colorlib(String strUsuario,String strPass) {
//    a. Abrir Navegador con la url de prueba
		colorlibLoginPage.open();
/*    b. Ingresar usuario demo
      c. Ingresar password demo
      d. Click en botón Sign in */
		colorlibLoginPage.IngresarDatos(strUsuario,strPass);
//    e. Verificar la autenticación (label en home)
		colorlibLoginPage.VerificaHome();
	}
	
	
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}
	
	

}
