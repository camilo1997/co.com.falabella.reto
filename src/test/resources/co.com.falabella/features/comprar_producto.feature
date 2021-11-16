@ComprarProducto
Feature: Comprar prodcuto
  Yo como cliente de la tienda online de falabella
  Necesito elegir un producto
  Para comprar y pagar lo seleccionado.

  @ComprarProductoExitoso
Scenario Outline: Seleccionar y pagar producto
    Given Juan Desea ir a la pagina de falabella
    When Selecciona el producto ingresa a la bolsa de compras
    | producto |
    | <producto> |
    And Ingresa los datos de la direccion
    | departamento   | ciudad   | barrio   | direccion   | tipoVivienda   |
    | <departamento> | <ciudad> | <barrio> | <direccion> | <tipoVivienda> |
    And Ingresa los datos tarjeta
    | nombreTitular   | numeroTarjeta   | cvv   | fechaVencer   |
    | <nombreTitular> | <numeroTarjeta> | <cvv> | <fechaVencer> |
    And Ingresa los datos personales
    | nombre   | apellido   | email   | id   | celular   |
    | <nombre> | <apellido> | <email> | <id> | <celular> |
    Then Valida que el sistema muestre el siguiente <mensaje>

    Examples:

    | producto | departamento | ciudad   | barrio   | direccion     | tipoVivienda  | nombreTitular | numeroTarjeta    | cvv | fechaVencer | nombre | apellido |         email            |   id        | celular   |
    | portatil | ANTIOQUIA    | MEDELLIN | MEDELLIN | Cra 32 #32B-68| casa en unidad| Camilo Lopera | 4174732929343812 | 430 | 07-25      | juan   |   perez  |juanperez1564@hotmail.com | 5612328756  |3015648127 |



