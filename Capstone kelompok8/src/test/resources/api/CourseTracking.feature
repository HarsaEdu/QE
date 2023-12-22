Feature: Course Tracking

  Scenario: Verify Get All User Course Enrroled
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: Verify Get All User Course Enrroled With Wrong Method
    Given I set GET all endpoints
    When I send GET all HTTP request
    Then I receive valid HTTP response code 404

  Scenario: Verify Get All User Course Enrroled With Wrong Endpoint
    Given I set GET all user endpoints
    When I send GET all user HTTP request
    Then I receive valid HTTP response code 405

  Scenario: Verify delete enrolled
    Given I set delete endpoints
    When I send delete HTTP request
    Then I receive2 valid HTTP response code 200

  Scenario: Verify delete enrolled With Wrong Method
    Given I set put endpoints2
    When I send put HTTP request2
    Then I receive3 valid HTTP response code 200

  Scenario: Verify delete enrolled With Wrong Endpoint
    Given I set delete endpoints3
    When I send delete HTTP request3
    Then I receive4 valid HTTP response code 200

  Scenario: Verify enrolled user
    Given I set post endpoints
    When I send post HTTP request
    Then I receive5 valid HTTP response code 200


  Scenario: Verify delete enrolled With Wrong Endpoint
    Given I set put endpoints3
    When I send put HTTP request3
    Then I receive3 valid HTTP response code 404
#
  Scenario: Verify enrolled user
    Given I set post endpoints11
    When I send post HTTP request11
    Then I receive2 valid HTTP response code 405
#
#
#
  Scenario: Verify get all subcscribe
    Given I set get endpoints31
    When I send get HTTP request31
    Then I receive55 valid HTTP response code 200
#
  Scenario: Verify get all subcscribe With Wrong Method
    Given I set put endpoints
    When I send put HTTP request
    Then I receive5 valid HTTP response code 404

  Scenario: Verify get all subcscribe With Wrong Endpoint
    Given I set get endpoints
    When I send get HTTP request
    Then I receive6 valid HTTP response code 405
