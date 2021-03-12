# @SmokeTest
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @SanityTest
  Scenario: Simple test on tags
    Given SanityTest tag is chosen
    When in the class file
    Then execute this section