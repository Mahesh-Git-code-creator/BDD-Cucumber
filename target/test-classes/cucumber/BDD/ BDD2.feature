Feature: To validate login functionality in Adactin Hotel App

 Scenario: To validate login using valid credentials 
 
 Given user starts  "chrome" Browser
 And user launch app using  "https://adactinhotelapp.com/" 
 When user enters  using xpath "//input[@name='username']" text "kolluboinachinna" in usernametextbox
 And user enters text using xpath "//input[@name='password']" text "chinna@123" in passwordtextbox 
 And user clicks in login button using xpath "//input[@type='Submit']"
Then user verify picture is xpath "//img[@alt='Adactin Group: Hotel Reservation System']"
Then user verify Title is "Adactin.com - Search Hotel"
