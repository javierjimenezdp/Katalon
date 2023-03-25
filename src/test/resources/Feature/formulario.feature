Feature: Yo como usuario de pruebas, deseo crear una cuenta en Katalon
  @Stories1 @Scenario1
  Scenario Outline: Creacion exitosa de una cuenta en Katalon
    Given ingrese al website de Katalon, de clic sobre el botón princiapl
    And extraiga los datos de inicio de sesion usuario y contraseña para loggearme
    When registre la <facility>, <program> <fecha> y agregue un <comentario>
    Then me dirige a una pantalla de confirmación y luego al homepage

    Examples:
      |facility|program|fecha|comentario|
      |Seoul CURA Healthcare Center|Medicaid|31|Testing QA|