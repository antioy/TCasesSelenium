Feature: Invalid Login operation on the page https://www.saucedemo.com/
  As a user
  I can not to be able to login with invalid username and password


  @smoke
  Scenario Outline: Unsuccessful login of a random user
    Given I am on the <login_page>
    And I use  invalid credentials <username> and <password>
    When I submit to login
    Then I can see the error ' Username and password do not match any user in this service'

    Examples:
      | username      | password     | login_page                   |
      | stand_user    | secret       | https://www.saucedemo.com/   |