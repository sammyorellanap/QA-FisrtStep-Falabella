Feature: Prueba para guardar una Pregunta de tipoo Autoevaluacion

  Scenario Outline: GuardarPreguntaAutoevaluacion
    Given Abrimos el navegador y vamos al sitio web de preguntas
    When El usuario ingrese el estado "<estado>", la pregunta "<pregunta>" y el periodo academico "<periodo>"
    And el usuario precione el boton guardar
    Then el usuario debea ver el mensaje "<mensaje>"

    Examples: 
      | estado | pregunta                                 | periodo | mensaje          |
      | activo | el docente presenta contenidos correctos | 2016 2  | Exito al Guardar |
