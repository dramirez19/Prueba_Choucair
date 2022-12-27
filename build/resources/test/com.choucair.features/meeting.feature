#Autor: d.ramirez.0109@gmail.com

Feature: Crear una "Nueva Meeting"
  Yo como... automatizador de pruebas
  Necesito... crear una "Nueva Meeting"
  Para... validar su correcto funcionamiento

  Scenario: Añadir una "Nueva Meeting"
    Given "Actor" desea ingresar a la página web "https://serenity.is/demo/"
    And Se loggea con usuario "admin" y clave "serenity"
    When Añade una reunión con la información
      | meeting_name   | Sprint 1 - Follow up   |
      | meeting_number | 1234                   |
    Then Valida que se haya creado correctamente la reunion bajo el nombre "Sprint 1 - Follow up"


