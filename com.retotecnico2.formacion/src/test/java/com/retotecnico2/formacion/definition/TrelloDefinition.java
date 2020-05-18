package com.retotecnico2.formacion.definition;

import java.util.List;

import com.retotecnico2.formacion.steps.Trello2FormValidationSteps;
import com.retotecnico2.formacion.steps.Trello2ValidationSteps;
import com.retotecnico2.formacion.steps.TrelloFormValidationSteps;
import com.retotecnico2.formacion.steps.TrelloValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TrelloDefinition {
	
	@Steps
	TrelloValidationSteps trelloValidationSteps;
	
	@Steps
	TrelloFormValidationSteps trelloFormValidationSteps;
	
	@Given("^Auntentico en TrelloLogin con correo electronico \"([^\"]*)\"$")
	public void auntentico_en_TrelloLogin_con_correo_electronico(String correoelectronico) throws Throwable {
		trelloValidationSteps.login_trello(correoelectronico);
	}

	@When("^Diligencio Formulario Registarse para obtener tu cuenta$")
	public void diligencio_Formulario_Registarse_para_obtener_tu_cuenta(DataTable dtDatosForm) throws Throwable {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size();i++) {
		  trelloFormValidationSteps.diligenciar_carga_datos_tabla(data,i);
		  }
		try {
			  Thread.sleep(20000);
		  
		  }catch(InterruptedException e) {}
		}
	  
	

	@Then("^Verifico creación exitosa del usuario$")
	public void verifico_creación_exitosa_del_usuario()  {
		trelloFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	
	@Steps
	Trello2ValidationSteps trello2ValidationSteps;
	
	@Steps
	Trello2FormValidationSteps trello2FormValidationSteps;
	
	@Given("^Auntentico la cuenta  en Login con User \"([^\"]*)\" y Password \"([^\"]*)\"$")
	public void auntentico_la_cuenta_en_Login_con_User_y_Password(String User, String Password) throws Throwable {
		trello2ValidationSteps.login_trello(User, Password);   
	}


	@When("^Diligencio La creación de tableros en la App Trello$")
	public void diligencio_La_creación_de_tableros_en_la_App_Trello(DataTable dtDatosForm) throws Throwable { 
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size();i++) {
			trello2FormValidationSteps.diligenciar_creacion_tablero(data,i);
		  }
	}

	@Then("^verifica la creación exitosa de los tableros\\.$")
	public void verifica_la_creación_exitosa_de_los_tableros()  {
		trello2FormValidationSteps.verificar_creacion_de_tableros_exitosos();  
	}



}
