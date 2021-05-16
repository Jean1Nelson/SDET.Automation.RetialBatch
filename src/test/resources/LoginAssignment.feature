
Feature: Login validation
 
@login 
Scenario Outline: No creds
Given: I am on the login "https://opensource-demo.orangehrmlive.com/"
When: I enter all combinations of user id "<userid>" and password as "<password>"
Then: I need validate the "<Expected_output>"
And: user login into application

| userid | password | 
| Last Expected_output | status| 

Scenario Outline: username only
Given: I am on the login "https://opensource-demo.orangehrmlive.com/"
When: I enter all combinations of user id "<userid>" and password as "<password>"
Then: I need validate the "<Expected_output>"
And: user login into application

| userid | password | 
| Last Expected_output | status| 

Scenario Outline: login validation
Given: I am on the login "https://opensource-demo.orangehrmlive.com/"
When: I enter all combinations of user id "<userid>" and password as "<password>"
Then: I need validate the "<Expected_output>"
And: user login into application

| userid | password | 
| Last Expected_output | status| 




@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
