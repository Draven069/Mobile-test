@shopping_cart
Feature: Gestión del carrito de compras en Sauce Labs

  Scenario Outline: Agregar productos al carrito
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When selecciono el producto "<PRODUCTO>" y agrego <UNIDADES> al carrito
    Then valido que el carrito de compras muestre correctamente <UNIDADES> unidades

    Examples:
      | PRODUCTO                   | UNIDADES |
      | Sauce Labs Backpack        | 1        |
      | Sauce Labs Bolt - T-Shirt  | 1        |
      | Sauce Labs Bike Light      | 2        |




