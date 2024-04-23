Feature: Go to Google and search for ipl and enter ipl home page

@iplHomePage
Scenario Outline: Search in Google and Enter ipl home page screen
    Given User is on Google search page
    When User searched with the ipl in the search box
    And Click on official website available in the search results and validate lands in home page
    Then Select on fan poll page



