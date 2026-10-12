Feature: To validate login functionality in Adactin Hotel App

@mahe_01

 Scenario Outline: To validate login using different combination of inputs   
 
 Given user starts  "chrome" Browser
 And user launch app using  "https://adactinhotelapp.com/" 
 When user enters  using xpath "//input[@name='username']" text '<Username>' in usernametextbox
 And user enters text using xpath "//input[@name='password']" text '<password>' in passwordtextbox 
 And user clicks in login button using xpath "//input[@type='Submit']"
Then user verify Title is  '<ExpTitle>'

Examples:

|Username | password   |ExpTitle |
|kolluboinachinna| chinna@123|Adactin.com - Search Hotel |
|Chinnababu| Chinna$123|Adactin.com - Hotel Reservation System|
|Chinna      | Chinna@123|Adactin.com - Hotel Reservation System |
|Chinna    | Chinna$123|Adactin.com - Hotel Reservation System |