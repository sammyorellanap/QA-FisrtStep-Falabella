Feature: prueba de carga de preguntas de la AutoEvaluacion

  Scenario Outline: 
    Given Abrimos el navegador y vamos al sitio web del login
    Then El usuario deberia ver las preguntas "<pregunta>" al final

    Examples: 
      | pregunta                  |
      | Pregunta AutoUno          |

  
  
  