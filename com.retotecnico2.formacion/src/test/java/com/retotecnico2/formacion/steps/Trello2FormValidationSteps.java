package com.retotecnico2.formacion.steps;

import java.util.List;

import com.retotecnico2.formacion.pageobjects.Trello2FormValidationPage;

import net.thucydides.core.annotations.Step;

public class Trello2FormValidationSteps {
	
	Trello2FormValidationPage trello2formvalidationPage;
	
	@Step
	public void diligenciar_creacion_tablero(List<List<String>> data, int id) {	
		trello2formvalidationPage.Menu_Tableros();
		trello2formvalidationPage.Submenu_Tablero();
		trello2formvalidationPage.Name_Tablero(data.get(id).get(0).trim());
		trello2formvalidationPage.Boton_Crear();
		
	}
	
	@Step
	public void verificar_creacion_de_tableros_exitosos() {
	trello2formvalidationPage.form_sin_errores();
}
}