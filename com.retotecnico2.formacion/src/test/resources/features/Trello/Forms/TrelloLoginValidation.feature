#Author: velkysargel@hotmail.com

@Regresion
Feature: Como Analista de una célula de pruebas, 
quiero utilizar la aplicación Trello para realizar un control de las actividades planeadas, 
que se están realizando y finalizadas en mi equipo de trabajo.
  

  @CasoExitoso
   Scenario: Registro de cuenta en la App Trello,
           se presenta un mensaje de creación exitoso.
    Given Auntentico en TrelloLogin con correo electronico "velkysargel@gmail.com" 
    When Diligencio Formulario Registarse para obtener tu cuenta
    |Nombre Completo | Contraseña |
    |Petra Gonzalez|groot2017   |
    Then Verifico creación exitosa del usuario
 

 #@CasoAlterno
 #Scenario: Se registra el diligenciamiento de la ceacion de tableros en la App Trello,
            #Se verifica la creación exitosa de los tableros.
    #Given Auntentico la cuenta  en Login con User "adss@gmail.com" y Password "Mundo12345."
        #When Diligencio La creación de tableros en la App Trello
        #|Name    |
        #|prueba 4|
        #|prueba 5|
        #|prueba 6|
        #Then verifica la creación exitosa de los tableros.
   
   
   

      
      
      
      