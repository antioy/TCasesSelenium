Feature: Valid Login operation on the page https://www.saucedemo.com/
  As a user
  I want to be able to login with valid username and password


  @smoke
  Scenario Outline: Successful login of a registered user
    Given I am on the <login_page>
    And I use  valid credentials <username> and <password>
    When I submit to login
    Then I can see the Products page

    Examples:
      | username      | password     | login_page                 |
      | standard_user | secret_sauce | https://www.saucedemo.com/ |
