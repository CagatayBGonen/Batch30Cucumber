Feature: US1003 amazon search with parameter
  @amazon
  Scenario: TC07 istenen kelimenin oldugunu test etme
    Given kullanici "techproeducationURL" sayfasina gider
    And "nutella" icin arama yapar
    Then sonucunun "nutella" icerdigini test eder
    And sayfayi kapatir

    # parametre olarak yazdigimiz kelimeyi stepdefinition'da String olarak kullancaksa
    # ne yazdigmiz onemli degil "nutella" gibi'!

    # Ancak Configuration.properties'den alicaksak, yazdigimiz kelime
    # Configuration.properties'deki kelime ile ayni olmalidir.