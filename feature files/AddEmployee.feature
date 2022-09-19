Feature: AddEmp
@MultipleDatass
Scenario Outline:
Add Employee with multiple data
Given User navigates Url "http://orangehrm.qedgetech.com/"
When user log as username "Admin" and log as password "Qedge123!@#"
When user click on login button
When user click on pim button
When user click  button
When user enters "<Firstname>" and "<MiddleName>" and "<Lastname>"
When user capture emid
When user click on save button
When user capture emid after save
Then user valid emid
Then user close browser
Examples:
|FirstName|MiddleName|LastName|
|Devi1|Selenium1|Testing1|
|Devi2|Selenium2|Testing2|
|Devi3|Selenium3|Testing3|
|Devi4|Selenium4|Testing4|