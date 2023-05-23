Feature: Verify the TVO Home Page

  #TC_01
  @TVO
  Scenario: Verify that the "Docs & Series" page title is available
    Given  user lands on the home page
    Then user should see the TVO today page displayed
    And they should see the "Docs & Series" dropdown title displayed
    When  user clicks on the Docs & Series dropdown option




