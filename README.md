# Sample Project


<h1 align="center">
  <img src="https://raw.githubusercontent.com/cucumber/cucumber-js/4c80df1a25c3bb25dc57d65ab8e5ee842a469826/docs/images/logo.svg" alt="">
  <br>
  Cucumber
</h1>


In this project, IntelliJ is used as IDE, Used Maven repo to configure the project, the coding language in which the project is written is Java, the `Cucumber BDD` Framework was used, and the `POM` (Page Object Model) design model was used in accordance with the `OOP` (Object Oriented Programming) concept in the Cucumber Framework.
* Used `maven` as project configuration tool.
* In the UI, `Selenium Webdriver` was used.
# Description of Project Structure

This is a readme file for the TVO Docs & Series functionality verification. 
The verification process involves testing various scenarios using the Cucumber framework, Gherkin language, and the Page Object Model (POM) approach. 
Reusable methods have been used to enhance code maintainability and reusability.


* The POM structure you see below was used;


* Data Driven feature has been added to our Behavior Driven Development Framework by using Scenario Outline in feature files. 
Because we can develop this Test Case by sending as much Data as we want to Scenario Outline and we will gain a Data-oriented feature.


* `Data Driven Framework` is a method of separating datasets from test case. Once the datasets leave the test case, they can be easily modified for specific functionality without changing the code. It is used to fetch test cases and packages from external files such as Excel, .csv, .xml or some database tables.


* `Hybrid Framework` is a concept where we take advantage of both Keyword driven framework and Data Driven Framework. It is an easy-to-use framework that allows manual testers to create test cases just by looking at keywords, test data, and object storage without coding in the framework.


# Runner File
* Thanks to the notations used in the 'Runner' class, both the reports of the feature files that we can run here and the creation of the desired methods can be provided.
* Runs from runner by adding tags to scenarios.


# Resources
* Resources is the file containing the feature files, where the feature is created using `BDD` (Behavior Driven Development) and using `Gherking` language. Generated steps
  It provides the opportunity to create it as a direct method, thus making it more understandable for people who have nothing to do with java language or software.

# pom.xml
* Thanks to `Pom`, we can place the library of the codes we actually want to use in the dependencies tag in this file, which contains the information of all our works and codes, and we can keep the updated information constantly. Thanks to this place, we can provide access to all codes.

# pages package <br/>
In this package, there are classes where we locate the web elements that we have tested. We created the PageFactory class, called the driver and used this key. We created our locates with FindBy notation to call our locations.
The page objects used in the step definitions are:
*  DocsSeriesPage: Represents the Docs & Series page elements and related actions.
* HomePage: Represents the Home page elements and related actions.

### utils package <br/>
This package contains our classes and methods that we constantly need.
Driver,ConfigReader,ReusableMethods,etc...

### configuration.properties <br/>
In this properties file, there are variables that we use constantly. In order to be able to call the variables that we have created as key=value in this file to other classes, we call the class we want the information to, thanks to the method in the ConfigReader class from the utilities package.


# Test Cases
### Feature: Verify the Docs & Series Functionality
The feature file contains the following scenarios:

* TC_01: Verify that the "Docs & Series" page title is available
This scenario ensures that the TVO today page is displayed after landing on the home page.
It verifies the visibility of the "Docs & Series" dropdown title.
The scenario clicks on the Docs & Series dropdown option and expects the page to load successfully.


* TC_02: Verify that "All" is selected in the category navigation
This scenario verifies that the "All" label button is available and selected.


* TC_03: Validation of tab names in Docs & Series Page
This scenario verifies the presence and order of different tabs in the Docs & Series page.


* TC_04: Verify that the documentaries are sorted correctly based on chosen criteria
This scenario verifies that the documentaries are sorted in the expected order.


* TC_05: Verify that the "Search" functionality is working properly
This scenario checks the availability and functionality of the search button.
It verifies that the search field is displayed and the search results for "Docs & Series" are shown.


* TC_06: Verify that the "Docs & Series" page is expanded after hovering on it
This scenario tests if the "Docs & Series" option expands when hovered over.


* TC_07: Verify that the "Next & Prev" button is working properly under Docs & Series
This scenario verifies the availability and functionality of the next and previous arrows.


* TC_08: Verify that the "Docs & Series" cross button is working properly
This scenario checks the availability and functionality of the cross button.
It verifies that the expanded page is closed when the cross button is clicked.


* TC_09: Verify that the specific button is selected after clicking on it
This scenario verifies that the A-Z button is available and selected.


* TC_10: Verify that the "Load More" button is working properly
This scenario tests the functionality of the load more button.
It verifies that the load more option is available, and the last history item changes after clicking the load more button.

