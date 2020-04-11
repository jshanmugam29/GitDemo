Feature: Test facebook smoke scenario

  Scenario: Test Login with valid credentials
    Given Open chrome and start application
    When I enter valid username as "jvignesh107@gmail.com"
    And I enter valid password as "window123$"
    Then user should be able to login successfully
    And Course Displayed are "true"
    
      Scenario: Test Login with invalid credentials
    Given Open chrome and start application
    When I enter valid username as "jvignesh107@gmail.com"
    And I enter valid password as "window123"
    Then user should be able to login successfully
    And Course Displayed are "false"