Feature: Biller payment by customer

  Scenario: Customer is able to see unpaid bill for the month
    Given customer wants to pay bill
    When customer selects the biller
    Then they should get unpaid bill for the month

  Scenario: Customer is able to pay the bill successfully
    Given customer has selected a bill
    When a customer selects the pay bill option
    And the bill should be paid
    Then the amount deducted from the wallet and credited to the biller account

  Scenario: Customer is advised for insufficient wallet balance
    Given customer has selected a bill
    When a customer selects the pay bill option with less or zero wallet balance
    And the bill should not be paid
    Then an appropriate error message related insufficient wallet balance is displayed

  Scenario: Customer is advised incase customer tries to pay already paid bill
    Given customer wants to pay bill for already paid month
    When customer selects the biller
    Then an appropriate informative message is displayed for already paid bill

  Scenario: Customer is advised incase customer tries to search a particular biller who is not on the list
    Given customer wants to pay bill
    When customer try to search biller (who is not in biller list)
    Then an appropriate error message is displayed

