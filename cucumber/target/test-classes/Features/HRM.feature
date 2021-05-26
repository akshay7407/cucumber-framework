Feature: test HRM website

  @sanity
  Scenario: login page functinality
    Given user open login page
    Then user logs into app
    Then homepage is displayed
    Then validate homepage titile

  @regression
  Scenario: add user
    Given user is on hompage
    When user perform click on adminlink
    Then User click on add
    Then user feel the data for user

  @sanityy
  Scenario Outline: facebook account create account
    Given user is on craete package page
    When title of login page
    When user enters "<Firstname>" and "<surname>" and "<password>"
    Then user enter date of birth <date> and "<month>" and <year>
    And closes the browser

    Examples: 
      | Firstname | surname | password     | date | month | year |
      | akshay    | gaikwad | Akshay@321   |    1 | Jan   |    2 |
      | ramdas    | gaikwad | ramdas@321   |    2 | Feb   |    5 |
      | sanjay    | jadhav  | ramdas@32444 |    3 | Feb   |    5 |
      | defame    | doifode | doifode@34   |    4 | Mar   |    4 |

 
  @datatest
    Scenario Outline: Directory
    When user click on directory
    Then user enter "<empname>"
    And select the <title>
    Then select job <location>
    Then click on Search

    Examples: 
      | empname         | title | location |
      | Ananya Dash     |     1 |        2 |
      | Manali Kulkarni |     2 |        2 |
      | Kallyani Bhute  |     3 |        2 |
      
      @Time
      Scenario: Time Element inspection
      Given User login on hompage
      When user mouse over Time Element
      Then user mouse over Project info and click on customers
      Then USer inspect the checkbox is sselected or not 
      And user Select the ACME ltd Checkbox and Delete it
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
