@farid
Feature: Reqresin

   Scenario: Success Get users
     When user send Get Update request to reqresin
     Then response status code should be 200
     And  response path "page" should contain Int value "2"
     And  response path "data[0].first_name" should contain String value "Michael"

     Scenario: Success POST login
       When  user send Get Update request to reqresin
       Then  response status code should be 200

     Scenario:  Success PUT update
       When user send Get Update request to reqresin
       Then response status code should be 200