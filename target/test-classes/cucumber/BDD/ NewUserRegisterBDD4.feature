Feature: To validate login functionality in Adactin Hotel App

@mahe_02

 Scenario Outline: To validate login using different combination of inputs   
 
 Given user starts  "chrome" Browser
 And user launch app using  "https://adactinhotelapp.com/" 
 When user enters  using xpath "//input[@name='username']" text  "kolluboinachinna" in usernametextbox
 And user enters text using xpath "//input[@name='password']" text "chinna@123" in passwordtextbox 
 And user clicks in login button using xpath "//input[@type='Submit']"
 Then user verify Title is "Adactin.com - Search Hotel"
When user enters in newLoginForm details using xpath "//select[@name='location']" and Location is "Melbourne"
And user enters in newLoginForm details using xpath "//select[@name='hotels']" and Hotels  is "Hotel Sunshine"
And user enters in newLoginForm details using xpath "//select[@name='room_type']" and RoomType is "Double"
And user enters in newLoginForm details using xpath "//select[@name='room_nos']" and noOfRooms is "3 - Three"
And user enters in newLoginForm details using xpath "//input[@id='datepick_in' ]" and CheckInDate 
And user enters in newLoginForm details using xpath "//input[@name='datepick_in']" and CheckInDate is "22/08/2026"
And user enters in newLoginForm details using xpath "//input[@name='datepick_out']" and CheckOutDate
And user enters in newLoginForm details using xpath "//input[@name='datepick_out']" and CheckOutDate  is "23/08/2026"
And user enters in newLoginForm details using xpath "//select[@name='adult_room']" and AdultsPerRoom is "3 - Three"
And user enters in newLoginForm details using xpath "//select[@name='child_room']" and Childrens PerRoom is "2 - Two"
And user clicks in submit button using xpath "//input[@id='Submit']"