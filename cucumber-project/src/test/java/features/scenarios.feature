Feature: User Information

Scenario: storing user information into the db successfully
Given I am user and sending personal details to the API
And I am providing the request to send details
When I submit request details
Then I recieve response as accepted


Scenario: storing user information into the db without passing all values
Given I am user and sending personal details to the API
And I am providing invalid request to api
When I submit request details
Then I recieve error response