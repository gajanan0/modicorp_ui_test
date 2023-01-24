Feature: Customer Registration

  Scenario: Customer is able to register and create wallet for valid email address
    Given customer wishes to sign up for bill payment
    When a valid email address is provided by the customer
    Then a wallet is created and registered for the customer

  Scenario: Customer is unable to register and create wallet for invalid email address
    Given customer wishes to sign up for bill payment
    When a customer provides an invalid email address
    Then an appropriate error message is displayed

  Scenario: Customer is unable to register and create wallet for duplicate email address
    Given customer wishes to sign up for bill payment
    When customer provides an email address that is already in the system
    Then an appropriate error message is displayed


