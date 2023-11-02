Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user starts the application and log in to the app.
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |


  Scenario Outline: The user starts the application and sign up to the app.
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed


    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |


  Scenario Outline: The user changes the language of the app.
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    And The user changes the language
    And The user log out of the app
    Then Login page is displayed

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |