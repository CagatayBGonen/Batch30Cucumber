Feature: US1004 ebay sayfasinda kelime arama
  Scenario: TC08 kullanici bestbuyda istedigi kelimeyi aratmayi test eder
    # bu test CALISMAZ
    Given kullanici "ebayURL" sayfasina gider
    Then "nutella" icin arama yapar
    And sonucunun "nutella" icerdigini test eder
    Then sayfayi kapatir

    # burada tum stepdefinitionlar tanimli gibi gorunsede
    # testimiz calismaz
    # amazon sayfasina gore yapildilar, ayni cümleyi kurdugumuz icin yeni cumle istemedi.
    # bu yüzden daha belirleyici cumleler yazilmali