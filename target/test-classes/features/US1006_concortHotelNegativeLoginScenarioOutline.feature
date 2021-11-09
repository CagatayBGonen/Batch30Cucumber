Feature: US1006 Concort Hotels sayfasinda farkli kullanici adlari ile negative test

  @QACH @QANegativeLogin
  Scenario Outline: TC10 Farkli kullanici ismileri ile negative test

    Given kullanici "QAConcortHotelURL" sayfasina gider
    Then QACH login linkine tiklar
    And QACH username kutusuna "<wronguserName>" yazar
    And QACH password kutusuna "<wrongPassword>" yazar
    And QACH login buttn basar
    Then QACH giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
      | wronguserName | wrongPassword |
      | Manager5      | Manager5!     |
      | Manager6      | Manager6!     |
      | Manager7      | Manager7!     |
      | Manager8      | Manager8!     |
      | Manager9      | Manager9!     |