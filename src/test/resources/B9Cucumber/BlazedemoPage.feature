Feature: Purchase ticket Page Functionality

  Scenario Outline: Verify User add correct information
    Given User navigates to the Purchase Flight Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<fullName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And user enters Zip Code "<zipCode>"
    And User selects Card Type "<cardType>"
    And User enters Card number"<cardNumber>"
    And User enters Card Month "<month>"
    And User enters Card Year "<year>"
    And User enters Credit Card Name "<cardName>"
    And User clicks on Remember me box
    And User clicks on Purchase Flight Btn
    Then User verifies success message "<message>"

    Examples: 
      | fullName      | address         | city         | state    | zipCode | cardType         | cardNumber | month | year | cardName      | message                           |
      | robert Garcia | 123 marina dr   | Woodbridge   | Virginia |   22191 | American Express |  234789300 |    11 | 2026 | robert Garcia | Thank you for you purchase Today! |
      | carlos moran  | 345 drive st    | La Plata     | Maryland |   21108 | Visa             |  234970085 |    08 | 2025 | carlos moran  | Thank you for you purchase Today! |
      | Gary cruz     | 678 columbia rd | Millersville | Maryland |   20939 | Visa             |  123098757 |    05 | 2023 | Gary cruz     | Thank you for you purchase Today! |
      | Maria lopez   | 912 drive cir   | Burke        | Virginia |   22193 | Visa             |  456987635 |    10 | 2027 | Maria lopez   | Thank you for you purchase Today! |
      | julio perez   | 454 knowles st  | Reston       | Virginia |   22231 | American Express |  199999333 |    02 | 2024 | julio perez   | Thank you for you purchase Today! |
