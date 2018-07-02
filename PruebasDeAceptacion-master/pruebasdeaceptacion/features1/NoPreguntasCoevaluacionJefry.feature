Feature: Prueba de Coevaluacion preguntas no encontradas

  Scenario Outline: Preguntas_Coevaluacion_No_Encontradas
    Given Abrimos el navegador y vamos al sitio web de respuesta Coevaluacion
    Then El usuario debera ver el mensaje "<mensaje>" para saber que no hay preguntas

    Examples: 
      | mensaje           |
      | No records found. | 

