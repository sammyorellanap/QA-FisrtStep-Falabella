Feature: Prueba para no ver preguntas de autoevaluacion

  Scenario Outline: NoVerPreguntasAutoevaluacion
    Given Abrimos el navegador y vamos al sitio web no ver preguntas de autoevaluacion
    Then El usuario deberia ver el mensaje "<mensaje>" para saber que no hay preguntas

    Examples: 
      | mensaje           |
      | No records found. | 

