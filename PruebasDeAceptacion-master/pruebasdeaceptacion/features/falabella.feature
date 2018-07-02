Feature: Bolsa de Compra

  Scenario Outline: Proceso de Compra
    Given Abrimos el navegador y se escribe la palabra a buscar "<palabra>". Se presiona en el texto que dice falabella.com - Mejor Compra Online.
    When el usuario busca un producto "<producto>" para comprar. Luego presiona el producto para ver detalle. Finalmente se hace click en Bolsa de productos
    And el usuario presiona el boton de bolsa, aumenta a 2 productos, agrega garantia extendida de 2 años
    Then el usuario presiona el boton ir a comprar

    Examples: 
      | palabra   | producto   |
      | falabella | TV |
