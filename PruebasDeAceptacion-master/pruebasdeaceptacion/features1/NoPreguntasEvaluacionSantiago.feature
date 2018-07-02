Feature: prueba de carga de no preguntas de evaluacion

  Scenario Outline: 
    Given Abrimos el navegador y vamos al sitio web donde se deberian cargar las preguntas
    Then El usuario deberia ver el siguente "<mensaje>" el cual dice que no hay registros

    Examples: 
      | mensaje           |
      | No records found. | 
  
  
  