Feature: Verify the Docs & Series Functionality

  Background:
    Given  user lands on the home page
    Then user should see the TVO today page displayed
    And they should see the "Docs & Series" dropdown title displayed
    When  user clicks on the Docs & Series dropdown option



    #TC_02
  @TVO
  Scenario: Verify that "All" is selected in the category navigation
    Then  user should see the "All" label button available
    And user should see the "All" label button selected

    #TC_03
  @TVO
  Scenario: Validation of tab names in Docs & Series Page
    Then user should be able to see below tabs
      | All                 |
      | Series              |
      | Docs                |
      | A-Z                 |
      | TVO Originals       |
      | Art                 |
      | Canadian Docs       |
      | Current Affairs     |
      | Drama               |
      | Environment         |
      | History             |
      | International Docs  |
      | National Geographic |
      | Natural History     |
      | Science             |
      | Society             |
      | Technology          |


    #TC_04
  @TVO
  Scenario: Verify that the documentaries are sorted correctly based on chosen criteria
    Then user should be able to see documentaries are sorted accordingly
      | RECENTLY ADDED                        |
      | FOCUS ON PHOTOGRAPHY                  |
      | ABOUT MENTAL HEALTH                   |
      | CELEBRATING HOT DOCS 30TH ANNIVERSARY |
      | ASIAN HERITAGE MONTH                  |
      | TVO ORIGINALS                         |
      | ART                                   |
      | CANADIAN DOCS                         |
      | CURRENT AFFAIRS                       |
      | DRAMA                                 |
      | ENVIRONMENT                           |
      | HISTORY                               |
      | INTERNATIONAL DOCS                    |
      | NATURAL HISTORY                       |
      | SCIENCE                               |
      | SOCIETY                               |
      | TECHNOLOGY                            |


  #TC_05
  @TVO
  Scenario: Verify that the "Search" functionality is working properly
    Then Check that the search button is available
    When Click on the search option
    And Check that the search field is displayed
    When Click on the search field and insert "Docs & Series" valid text
    Then Check that the Docs & Series is displayed


    #TC_06
  @TVO
  Scenario: Verify that the "Docs & Series" page is expanded after hovering on it
    When user hover on Docs & Series option
    Then Docs & Series option is expanded

    #TC_07
  @TVO
  Scenario: Verify that the "Next & Prev" button is working properly under Docs & Series
    Then user checks that the next arrow is available
    When user clicks on the next arrow
    Then user checks that the Previous arrow is available
    When user clicks on the Previous arrow
    Then user checks that the next arrow is available


#TC_08
  @TVO
  Scenario: Verify that the "Docs & Series" cross button is working properly
    When user hover on Docs & Series option
    Then Docs & Series option is expanded
    And Check that the cross button is available top of the right corner
    When Click on the cross button
    Then Check that the expanded page is closed


    #TC_09
  @TVO
  Scenario: Verify that the specific button is selected after clicking on it
    When user checks that the A-Z button is available
    Then user clicks on the A-Z button
    Then user checks that the A-Z button is selected


    #TC_10
  @TVO
  Scenario: Verify that the "Load More" button is working properly
    When user hover on Docs & Series option
    Then Docs & Series option is expanded
    And user checks that the History option is available
    Then user clicks on the History button
    And Scroll down and check that Load more option is available
    And Check that the last history item
    When Click on the Load More option
    Then Again check that last history item
