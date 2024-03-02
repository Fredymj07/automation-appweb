# Author: Fredy Montaña

@Regresion
Feature: Registro de un nuevo usuario en la app web

Background:
    Given el usuario se encuentra en la pantalla de login del Portal Crediticio

  @RegistrarNuevoUsuario
  Scenario: Como nuevo usuario del app web quiero registrarme para poder ingresar a la aplicación
    Given el usuario presiona el boton para registrarse
    Then la persona ingresa el nombre de usuario "jackal"
    Then la persona ingresa la contraseña "@CronoS900107"
    Then la persona confirma la contraseña "@CronoS900107"
    Then la persona ingresa sus nombres "María Fernanda"
    Then la persona ingresa sus apellidos "Amézquita Millán"
    Then la persona ingresa el email "mafe@mail.com"
    And presiona el botón registrarme
    And la persona puede ver el home de la aplicación