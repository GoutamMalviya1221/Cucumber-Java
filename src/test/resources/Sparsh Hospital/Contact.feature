

@Contact
Feature: Contact US


  @Somke
  Scenario: TO validate the contact us 
    Given Open browser , enter the URL of Sparsh Hospital
    And Click on the ContactUS link
    When User enter firstname , lastname , phone number , email textbox
    And Select Yashwantpur Hospital from hospitak dropdown and select enquiry
    And Write a meeasge and click on send button
    Then Thankyou message should be displayed
    And Bank info should be available in the page

  @tag2
  Scenario Outline: TTO validate the contact us functionality with multiple data
    Given  Open browser , enter the URL of Sparsh Hospital
    And Click on the ContactUS link
    When User enter "<firstname>" , "<lastname>" , "<phone number>" , "<email>" textbox
    And Select Yashwantpur Hospital from hospitak dropdown and select enquiry
    And Write a meeasge and click on send button
    Then Thankyou message should be displayed
    And Bank info should be available in the page
    

    Examples: 
      | firstname  | lastname  | phone number  | email                 |
      | Goutam     |   Gurjar  | 9826812345    | gm1234@gmail.com      |
      | Gotam      |   Malviya | 9826512000    | gm123456@gmail.com    |
      | Goutama    |   Gurjar  | 9926612345    | goutamm12@gmail.com   |
      | Goutam     |   Malviya | 9926425410    | ggurjar12345@gmail.com|
      