#Autor: d.ramirez.0109@gmail.com

Feature: Crear una "Nueva Order"
  Yo como... automatizador de pruebas
  Necesito... crear una "Nueva Order"
  Para... validar su correcto funcionamiento

  Background:
    Given "Actor" desea ingresar a la página web "https://serenity.is/demo/"
    And Se loggea con usuario "admin" y clave "serenity"

  Scenario: Añadir una "Nueva Order"
    When Añade una nueva orden con la información
    | quantity |    5    |
    | discount |    1    |
    Then Valida que se haya agregado exitosamente el ultimo registro con el la fecha de orden "01/16/2023"

