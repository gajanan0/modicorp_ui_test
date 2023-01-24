Feature: Fund Wallet

  Scenario: Customer is able to see option to add funds to their wallet
    Given customer wishes to sign up for bill payment
    When they want to transfer funds to their wallet
    Then they should have the option to add funds to their wallet

  Scenario: Customer is able to successfully add funds to their wallet
    Given customer wishes to sign up for bill payment
    When they want to transfer funds to their wallet
    Then they are able to add funds to their wallet successfully

  Scenario: Customer is unable to add funds to their wallet if the amount to be added is less (assume 100)
    Given customer wishes to sign up for bill payment
    When they want to transfer funds to their wallet
    Then they are unable to add funds to their wallet successfully

  Scenario: Customer is unable to add funds to their wallet if the amount to be added is greater (assume 9999999)
    Given customer wishes to sign up for bill payment
    When they want to transfer funds to their wallet
    Then they are unable to add funds to their wallet successfully