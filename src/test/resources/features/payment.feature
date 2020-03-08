Feature: AS A User
I WANT TO upgrade to pro package 
SO THAT I am able to avail the benefits like digital forms and time recording

@SmokeTest
	Scenario: Validate Payment for upgrade to pro package
	  Given the User is on Setting page of craftnote and wants to take a pro plan
	    | home_page | login | pass |
		  | https://craftnote-development.firebaseapp.com | user1 | pass1 |
	  When the user clicks on upgrade to pro plan
	  And enters the subscription details 
	  | Company | firstName | lname | phnumber | email | street | zipcode | city |
	  | Autotest | fname | lname | 1234567890 | abc@test.com | street1 | 12555 | Berlin |
	  And enters the Billing information 
	  | card_number | ddmm | 
	  | 4242 4242 4242 4242 | 01 34 |
	  And enters the Payment Method
	  Then the summary of the payment is shown
	  And user clicks on paynow to confirm subscription
	  
	  