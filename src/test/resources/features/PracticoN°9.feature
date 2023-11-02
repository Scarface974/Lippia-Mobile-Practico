Feature: El cliente interactua con la app

  Scenario Outline: The user starts the application and log in to the app.
    Given La app cargo correctamente
    When EL usuario se logea en la aplicacion con: <email>, <password>
    Then Se muestra la página de inicio
    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |

  @Demo
Scenario Outline: El usuario modifica la hora establecida
  Given La app inicio correctamente
  When  El usuario se logea en la aplicacion con : <correo>, <contraseña>
  And   hace click en los tres botones verticales
  And   hace click en Edit
  And   hace click en el numero ubicado debajo de la primera casilla
  And   hace click en el numero ubicado debajo de la segunda casilla
  And   hace click en save
  Then  se muestra el valor



  Examples:
    | correo                    | contraseña            |
    |    esteban97@gmail.com    |    dontforget3oct     |
