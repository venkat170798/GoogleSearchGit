Feature: Open New tab and search

@NewTab
  Scenario Outline: Open new tab and search for apple website
    Given I want to open new tab
    When search for Apple and click on the website
    Then Validate Apple home page is lauched
    And Verify the old and new url is same
