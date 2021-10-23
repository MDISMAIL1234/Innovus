Feature: GoogleSearch
Scenario Outline: Verify Google Search is working

Given Browser is opened
And User is Google Page
When User enters<name> in serchfield
And User clicks On SearchButton
Then Search Results Page should be dispalyed

Examples:
|name          |
|qspiders      |

