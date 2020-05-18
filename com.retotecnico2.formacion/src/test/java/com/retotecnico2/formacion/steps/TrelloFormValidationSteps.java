package com.retotecnico2.formacion.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import com.retotecnico2.formacion.pageobjects.TrelloFormValidationPage;

public class TrelloFormValidationSteps {
	
	 TrelloFormValidationPage trelloFormValidationPage;
	
	@Step
	public void diligenciar_carga_datos_tabla(List<List<String>> data, int id) {	
	trelloFormValidationPage.Nombre_Completo(data.get(id).get(0).trim());
	trelloFormValidationPage.Crear_Contraseña(data.get(id).get(1).trim());
	trelloFormValidationPage.Boton_Registarse();
		
	}

@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
	trelloFormValidationPage.form_sin_errores();
}

}