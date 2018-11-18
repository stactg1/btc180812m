Feature: Buy a product
@smoke

Scenario Outline: endToEnd

Given OpenBrowser
|chrome|
|firefox|
|ie|
And navigate to URL
When i click on menu
And i click silk saree
And i click first product
And select color



