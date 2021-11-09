@background
Feature: US1002 amazon search with background

  Background: amazon sayfasina gitme
    When kullanici amazon sayfasina gider

  @amazon @nutella
  Scenario: TC04 amazon nutella arama


    And nutella icin arama yapar
    Then sonucunun nutella icerdigini test eder
    And sayfayi kapatir

  @amazon @java
  Scenario: TC05 amazon java arama


    And java icin arama yapar
    Then sonucunun java icerdigini test eder
    And sayfayi kapatir

  @amazon @ipad
  Scenario: TC06 amazon ipad arama


    And ipad icin arama yapar
    Then sonucunun ipad icerdigini test eder
    And sayfayi kapatir