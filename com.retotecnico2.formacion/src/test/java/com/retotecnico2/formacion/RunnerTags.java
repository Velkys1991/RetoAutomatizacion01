package com.retotecnico2.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/Trello/Forms/TrelloLoginValidation.feature", tags = "@Regresion")
@CucumberOptions (features = "src/test/resources/features/Trello/Forms/TrelloLoginValidation.feature", tags = "@CasoExitoso")
//@CucumberOptions (features = "src/test/resources/features/Trello/Forms/TrelloLoginValidation.feature", tags = "@CasoAlterno")
public class RunnerTags {

}
