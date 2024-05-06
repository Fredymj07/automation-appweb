# Author: Fredy Montaña

#@Regresion
Feature: Uso de la aplicación Employee Activities

Background:
    Given el usuario se encuentra en la pantalla de login
    When el usuario ingresa el usuario de red "devmontana@gmail.com"
    Then el usuario ingresa la contraseña "@CronoS900107"
    Then el usuario presiona el botón Iniciar sesión

  @NavegarPorModulos
  Scenario: Como usuario de la aplicación Employee Activities quiero navegar por los distintos módulos
    And el usuario presiona cada uno de los tabs de la aplicacion

  @CrearActividad
  Scenario: Como usuario deseo registrar una nueva actividad
    Given el usuario presiona el tab crear actividad
    Then el usuario ingresa el nombre de la actividad "Automatización de pruebas"
    Then el usuario ingresa la fecha "05/05/2024"
    Then el usuario ingresa la hora "06:10PM"
    Then el usuario ingresa la descripcion de la actividad "Actividad de prueba."
    And el usuario presiona el botón para guardar

  @RegistrarNuevoEmpleado @Regresion
  Scenario: Como nuevo usuario del app web quiero registrarme para poder ingresar a la aplicación
    Given el usuario presiona el tab empleados
    Then el usuario presiona el botón agregar empleado
    Then el usuario ingresa los datos del empleado
    And el usuario presiona el botón para guardar