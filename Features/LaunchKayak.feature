
@tag
Feature: Launch Kayak application
  
  @tag1
  Scenario: open browser 
    Given pass url as "https://www.kayak.com/"
    When Click on "Flights"
    Then pass  Destination Airport "anywhere"
    Then enter deptDate and returnDate
    
    And click on search
    

 
    
    
    
 