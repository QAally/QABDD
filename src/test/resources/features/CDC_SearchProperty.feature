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
@tag
Feature: Compliance Data Consolidation: Search for a property and upload action update assessment
  I want to use this template for my feature file
  
  ##AUTOMATION DEMO#
  
  #@RegressionComplianceDataConsolidation

    @RegressionChrome
    Scenario: Search by property reference
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
    And I enter the property reference "ABERDA002700"
    And I confirm the selection of property reference
    Then the message "North Forum" should be displayed
    
    @RegressionChrome
    Scenario: Search by invalid property reference
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
    And I enter the property reference "text"
    And I confirm the selection of property reference
    Then the message "No records found" should be displayed-
    
     @RegressionChrome
     Scenario: I upload an valid Action update assessment upload template
     Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
     And I click on the Uploads
     And I choose to upload a valid Action update Assessment file
     And I click on the upload button
     Then the message "File Uploaded Successfully" should be displayed
     
     ##AUTOMATION DEMO#
     
     
   Scenario: I upload an valid Lift assessment upload template
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
    And I click on the Uploads
    And I choose to upload a valid Lift Assessment file
    And I click on the upload button
    Then the message "File Uploaded Successfully" should be displayed
    
    
 @RegressionChrome
 Scenario: I upload an valid duplicate Lift Assessment upload template
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
    And I click on the Uploads
    And I choose to upload a duplicate Lift Assessment file
    And I click on the upload button
    Then the message "has already been uploaded into the DB" should be displayed
     
     
        @RegressionChrome
     Scenario: I upload an invalid Risk Actions upload template
     Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
     And I click on the Uploads
     And I choose to upload a file
     Then the message "Conversion Error in line 2 Field:RiskAssessmentDueDate; Value: '' to Date"
    
    @RegressionChrome
    Scenario: I upload an valid Lift assessment upload template
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/"
    And I click on the Uploads
    And I choose to upload a valid Lift Assessment file
    And I click on the upload button
    Then the message "File Uploaded Successfully" should be displayed
    
    ##AUTOMATION DEMO#
    
  @RegressionChrome
  Scenario: I upload an invalid Risk Actions upload template
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/"
    And I click on the Uploads
    And I choose to upload a file
    Then the message "Conversion Error in line 2 Field:RiskAssessmentDueDate; Value: '' to Date"

  @RegressionChrome
  Scenario: I upload an valid Risk Actions upload template
   Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
   And I click on the Uploads
   And I choose to upload a valid file
   And I click on the upload button
   Then the message "File Uploaded Successfully " should be displayed

##change lifts assessment for actions update


  @RegressionChrome
  Scenario: I upload an valid duplicate Action Assessment upload template
    Given I navigate to "http://ohgprodapp01.ohg.local:9050/ "
    And I click on the Uploads
    And I choose to upload a duplicate Action update Assessment file
    And I click on the upload button
    Then the message "has already been uploaded into the DB" should be displayed

 