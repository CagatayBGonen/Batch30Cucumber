Feature: US1010 data provider deneme testi
  @amazon @amazonMultiSearch
  Scenario Outline: TC14 data provider gibi arama olusturma testi
    Given kullanici "amazonURL" sayfasina gider
    Then "<product>" icin arama yapar
    And sonuc sayisinin yazdirir
    And sonucunun "<product>" icerdigini test eder
    And sayfayi kapatir




    Examples:
    |product|
    |java   |
    |nutella|
    |araba  |