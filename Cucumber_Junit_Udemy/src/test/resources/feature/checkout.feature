Feature: place the order for products

@PlaceOrder
Scenario Outline: seach experience for product search in both home and and offers page

Given user is on greenkart landing page
When user searched with shortname <Name> and extracted actual name of the product
And Added "3" items of the selected product to cart
Then user proceeds to checkout and validate the <Name> items in checkoutpage
And verify user has ability to enter promocode and place the order
Examples:
|Name|
|Tom|
