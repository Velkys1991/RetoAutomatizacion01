#Author: velkysarge@hotmail.com

@Regresion
Feature: Formulario Block Validation
  El Usuario debe poder ingresra al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longuitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través un globo informativo.
  

 @CasoExitoso
 Scenario: Digilenciamiento exitoso del formulario Block Validation,
            no se presenta ningun mensaje de validación.
    Given Auntentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a funcionalidad Forms Validation
    When Diligencio Formulario Block Validation
     | Requerid |Email            | Password1 |Passwor2|Date                  |Url                            |Digits Only  |Range         |
     | Valor1   |valor1@mail.com  |valor1     |valor1  |01/28/1992            |https://www.valor1.com         |123456       |6             |
     Then Verifico ingreso exitoso
 

 #@CasoAlterno
  #Scenario: Digilenciamiento con errores del formulario Block Validation,
         # Se presenta error en el diligenciamiento de alguno de los campos.
    #Given Auntentico en colorlib con usuario "demo" y clave "demo"
   # And Ingreso a funcionalidad Forms Validation
    #When Diligencio Formulario Block Validation
    #| Requerid |Email            | Password1 |Passwor2|Date                  |Url                            |Digits Only  |Range         |
    #|  |valor1@mail.com  |valor1     |valor1  |01/28/1992            |https://www.valor1.com         |123456       |6             |
    
   #Then Verifico que se presente error de validación.
   
   
   
 
      
      
      