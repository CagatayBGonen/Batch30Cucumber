Feature: US1001 amazon arama

  @amazon
  Scenario: TC01 amazon nutella arama

    When kullanici amazon sayfasina gider
    And nutella icin arama yapar
    Then sonucunun nutella icerdigini test eder