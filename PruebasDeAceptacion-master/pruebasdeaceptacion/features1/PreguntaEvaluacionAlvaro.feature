Feature: Prueba para ver preguntas evaluacion

  Scenario Outline: VerPreguntasEvaluacion
    Given Abrimos el navegador y vamos al sitio web ver preguntas evaluacion
    Then El usuario deberia ver el mensaje "<mensaje>"

    Examples: 
      | mensaje                        |
      | ¿ El profesor cumplio su deber | 

