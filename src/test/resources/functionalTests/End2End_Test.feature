Feature: Automated E2E Tests

Scenario Outline: Customer place an order by purchasing an item from search

Given user is on Home Page
When he search for "dress"
And choose to buy the first item
And moves to checkout from mini cart
And enter "<customer>" personal details on checkout page
#And Select delivery address
#And select paayment method as "check" payment
And place the order
Examples:
 |customer|
 |Lakshay|