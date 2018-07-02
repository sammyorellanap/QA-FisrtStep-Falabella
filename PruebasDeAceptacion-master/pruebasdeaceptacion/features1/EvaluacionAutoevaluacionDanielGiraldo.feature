Feature: Prueba para guardar una evaluacion de tipo Autoevaluacion

  Scenario Outline: GuardarEvaluacionAutoevaluacion
    Given Abrimos el navegador y vamos al sitio web de evaluaciones
    When El usuario ingrese el nombre "<nombre>", el programa academico "<programa>" y el periodo academico "<periodo>"
    And el usuario precione el boton guardar
    Then el usuario debera ver el mensaje "<mensaje>"

    Examples: 
      | nombre                | programa               | periodo | mensaje           |
      | aptitudes del docente | Ingenieria de Software | 2016 2  | Exito  al Guardar |
