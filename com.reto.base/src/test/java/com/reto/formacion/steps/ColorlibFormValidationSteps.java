package com.reto.formacion.steps;
import java.util.List;

import com.reto.formacion.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {
	
	static ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	
	public static void diligenciar_block_datos_tabla(List<List<String>> data, int id) {
		
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		colorlibFormValidationPage.Email(data.get(id).get(1).trim());
		colorlibFormValidationPage.Password1(data.get(id).get(2).trim());
		colorlibFormValidationPage.Password2(data.get(id).get(3).trim());
		colorlibFormValidationPage.Date(data.get(id).get(4).trim());
		colorlibFormValidationPage.Url(data.get(id).get(5).trim());
		colorlibFormValidationPage.Digits_Only(data.get(id).get(6).trim());
		colorlibFormValidationPage.Range(data.get(id).get(7).trim());
		colorlibFormValidationPage.Select_Agree();
		colorlibFormValidationPage.Boton_Validate();
		
	}
	
	@Step
	
	public static void verificar_ingreso_datos_formulario_exitoso() {
		colorlibFormValidationPage.form_sin_errores();
	}
	
@Step
	
	public static void verificar_ingreso_datos_formulario_con_errores() {
		colorlibFormValidationPage.form_con_errores();
	}
	

	

	
}
