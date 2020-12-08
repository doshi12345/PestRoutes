Feature: Customer creation


Scenario Outline: Validate customer creation
	Given I sign in to pestroutes domain
	When I create customer with "<first name>", "<last name>", "<address>" and "<zipcode>"
	Then I validate if "<first name>" , "<last name>" and "<address>" match in overview tab
	
	
	Examples:
	|first name|last name|address       |zipcode| 
	|Nilaydkbk | shah123   |45 carlos St  | 75071 | 
	