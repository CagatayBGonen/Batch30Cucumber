Feature: US1009 Concort Hotel Login testi
  @QACH @QAPositiveLogin
  Scenario: TC13 positive login testi
    When kullanici "QAConcortHotelURL" sayfasina gider
    Then QACH login linkine tiklar
    And QACH username kutusuna "manager" yazar
    And QACH password kutusuna "Manager1!" yazar
    And QACH login buttn basar
    Then QACH giris yapildigini test eder
    And sayfayi kapatir


