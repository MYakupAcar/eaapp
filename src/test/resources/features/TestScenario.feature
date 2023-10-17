Feature: Login, add new employee, delete employee
Background: User is on the Employee List Page
  Given User goes to home page
  And User login with given credentials
  And User goes to Employee Page


  @Smoke
  Scenario Outline: User creates new employee

    When user clicks create
    And User add "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
    And User clicks create button
    Then User see added emloyee with "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
    Examples:
      |name|Salary|Duration Worked|Grade|Email  |
      |yakup|1500|40|5|yakupacar@newmail.com  |
