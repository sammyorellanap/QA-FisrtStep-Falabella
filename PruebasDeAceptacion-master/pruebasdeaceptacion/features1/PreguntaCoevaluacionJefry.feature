Feature: Prueba para ver preguntas Coevaluacion

  Scenario Outline: Preguntas_Coevaluacion_Encontradas
    Given Abrimos el navegador y vamos al sitio web respuesta Coevaluacion
    Then El usuario debera ver la pregunta "<mensaje>" en el sitio web

    Examples: 
      | mensaje                          |
      | ¿ El profesor cumplio su deber ? |
