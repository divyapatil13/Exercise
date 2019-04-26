#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Verification of all the values and the total balance on the exercise page

## If required tags can be added here such as @smoke test, @regression test
## If the page requires login or setting values in the form, scenario outline can be used 

  Scenario: Verification of all the values and the total balance
    Given Browser is open and user is on the exercise page
    When Page loads and all the values with total balance is displayed
    Then Verify the right number of values are displayed
    And Verify the values are greater than zero
    And Verfy the total balance based on all the values listed
    And Verify the values are formatted as currencies
    And Verify the total balance matches the sum of all the values

    
