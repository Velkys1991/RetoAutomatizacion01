package com.reto.formacion.definition;

import java.util.List;

import com.reto.formacion.steps.ColorlibFormValidationSteps;
import com.reto.formacion.steps.BlockValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class BlockValidationDefinition {
	
	@Steps
	BlockValidationSteps blockValidationSteps;
	@Steps
	ColorlibFormValidationSteps colorlibFormvalidationSteps;
	
	@Given("^Auntentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void auntentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave)  {
		blockValidationSteps.login_colorlib(Usuario, Clave);
	    
	}

	@Given("^Ingreso a funcionalidad Forms Validation$")
	public void ingreso_a_funcionalidad_Forms_Validation() {
		blockValidationSteps.ingresar_form_validation();
	    
	} 

	@When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForm) throws Throwable {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size();i++) {
		  ColorlibFormValidationSteps.diligenciar_block_datos_tabla(data,i);
		  }
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso()  {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	    
	}
	
	@Then("^Verifico que se presente error de validación\\.$")
	public void verifico_que_se_presente_error_de_validación() throws Throwable {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();  
	}



}
