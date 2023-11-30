Feature: Clockify

  Scenario Outline: The user starts the application and log in to the app.
    Given la app cargo correctamente
    When  eL usuario se logea en la aplicacion con: <email>, <password>
    Then Se muestra la página de inicio
    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |


  @Demo
  Scenario Outline: The user adds a data entry to the app.
    Given la app cargo correctamente
    When  eL usuario se logea en la aplicacion con: <email>, <password>
     And  el usuario selecciona el boton + para agregar una nueva hora
     And  el usuario ingresa <primer_valor>  en el primer campo de hora
     And  el usuario ingresa <segundo_valor> en el segundo campo de minutos
     And  el usuario selecciona el boton SAVE para guardar la hora
    Then  el usuario visualiza la hora agregada


    Examples:
      | email             | password         |primer_valor|segundo_valor|
      |esteban97@gmail.com| dontforget3oct   |     12     |     24      |




  Scenario Outline: The user adds a date to the app.
    Given  la app cargo correctamente
     When  eL usuario se logea en la aplicacion con: <email>, <password>
      And  el usuario selecciona el boton + para agregar una nueva hora
      And  el usuario selecciona la fecha ubicada en el margen superior derecho
      And  el usuario selecciona el mes
      And  el usuario selecciona el dia
      And  el usuario selecciona el boton SAVE para guardar la fecha
     Then  el usuario visualiza la fecha seleccionada

    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |



  Scenario Outline: The user cancels an action in the app.
    Given  la app cargo correctamente
    When  eL usuario se logea en la aplicacion con: <email>, <password>
    And  el usuario selecciona el boton + para agregar una nueva hora
    And  el usuario selecciona la hora
    And  el usuario selecciona el minuto
    And  el usuario selecciona el texto DISCARD
    And  el usuario selecciona la opcion DISCARD
    And  el usuario selecciona la flecha ubicada en el margen superior izquierdo
    And  el usuario selecciona la opcion DISCARD
    Then  el usuario visualiza la seccion Time entries

    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |


  Scenario Outline: The user cancels an action in the app.
    Given  la app cargo correctamente
    When  eL usuario se logea en la aplicacion con: <email>, <password>
     And  el usuario selecciona en el menu desplegable ubicado en el margen superior izquierdo
     And  el usuario hace click en la seccion Setting
     And  el usuario selecciona la opcion Enable dark mode
     And  el usuario selecciona la opcion Show notifications
    Then  el usuario visualiza los cambios realizados

    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |



  Scenario Outline: The user starts the application and log in to the app.
    Given la app cargo correctamente
    When  eL usuario se logea en la aplicacion con: <email>, <password>
     And  el usuario selecciona en el menu desplegable ubicado en el margen superior izquierdo
     And  el usuario hace selecciona la opcion Log out
     And  el usuario confirma la accion
    Then  el usuario visualiza la pantalla de Log in
    Examples:
      | email             | password         |
      |esteban97@gmail.com| dontforget3oct   |
