Feature: EnteringIntoRaffle


  Scenario Outline: Successful entering with only mandatory fields
    When user provides "<Name>", valid "<Age>" and validate "<Email>"
    And user clicks on submit button
    Then user is successfully entered a raffle
    Examples:
      | Name   | Age | Email            |
      | Ksenia | 30  | Ksenia@gmail.com |

  Scenario Outline: Successful entering when entering mandatory fields and an optional field
    When user provides "<Name>", valid "<Age>" ,validate "<Email>" and "<Reason>"
    And user clicks on submit button
    Then user is successfully entered a raffle
    Examples:
      | Name | Age | Email          | Reason    |
      | Olga | 33  | Olga@gmail.com | happiness |

  Scenario Outline: Failed to enter when  not entering mandatory fields
    When user  doesnt provide  "<Name>", valid "<Age>" and validate "<Email>"
    And user clicks on submit button
    Then user failed to enter a raffle
    Examples:
      | Name | Age | Email |
      |      |     |       |


  Scenario Outline: Failed to Enter into Ruffle with invalid age
    When user provides "<Name>", invalid "<Age>" and validate "<Email>"
    And user clicks on submit button
    Then user see text "Must be 18 or older to enter."
    Examples:
      | Name | Age | Email         |
      | Sam  | 16  | sam@gmail.com |


  Scenario Outline: Failed to Enter into Ruffle with Email being not validated
    When user provides "<Name>", "<Age>" and "<Email>" is not validated
    And user clicks on submit button
    Then user has to re-enter email
    Examples:
      | Name | Age | Email     |
      | Noah | 40  | noahgmail |


  Scenario Outline: multiple entries to Ruffle
    When user provides "<Name>", valid "<Age>" and validate "<Email>"
    And user clicks on submit button
    Then user see submission confirmed text with number of entries
    And user refreshes the page to enter the raffle again
    Examples:
      | Name | Age | Email         |
      | Joe  | 35  | Joe@gmail.com |

  Scenario Outline: Failed to enter when  not entering name:
    When user  doesnt provide "<Name>", with valid "<Age>" and "<Email>"
    And user clicks on submit button
    Then user stays on the landing page
    Examples:
      | Name | Age | Email         |
      |      | 35  | Jim@gmail.com |

  Scenario Outline: Failed to enter when  not entering age:
    When user  doesnt provides "<Age>" with valid "<Name>" and "<Email>"
    And user clicks on submit button
    Then user see text "Must be 18 or older to enter."
    Examples:
      | Name | Age | Email         |
      | Amy  |     | Amy@gmail.com |

    Scenario Outline: User is able to enter a raffle multiple times
      When user provides "<Name>", valid "<Age>" and validate "<Email>"
      And user clicks on submit button
      Then user is successfully entered a raffle
      And user refreshes the page to enter the raffle again
      Examples:
        | Name   | Age | Email            |
        | Ksenia | 30  | Ksenia@gmail.com |
        | Ksenia | 30  | Ksenia@gmail.com |
        | Ksenia | 30  | Ksenia@gmail.com |





