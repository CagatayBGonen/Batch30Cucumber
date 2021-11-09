Feature: US1005 amazonda list ile arama

  Scenario Outline: TC09 amazonda verilen bir listeyi aratip, var olduklarini test ediniz

    Given kullanici "amazonURL" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonuc sayisinin yazdirir
    And sonucunun "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir








    Examples:
    |arananUrun|
    |nutella   |
    |java      |
    |ipad      |
    |armut     |
    |apple     |