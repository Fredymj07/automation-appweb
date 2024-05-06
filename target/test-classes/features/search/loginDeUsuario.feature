# Author: Fredy Montaña

#@Regresion
Feature: Inicio de Sesion

Background:
    Given el usuario se encuentra en la pantalla de login

  @PantallaDeLogin
  Scenario: Visualizacion de la pantalla de login del Portal Crediticio
    Then el usuario debería visualizar la pantalla de inicio de sesión

  @InicioSesion
  Scenario: Autenticacion del usuario utilizando las credenciales de Microsoft
    When el usuario ingresa el usuario de red "devmontana@gmail.com"
    Then el usuario ingresa la contraseña "@CronoS900107"
    Then el usuario presiona el botón Iniciar sesión