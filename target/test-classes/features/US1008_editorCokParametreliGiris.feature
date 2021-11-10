Feature: US1008 editor cok parametreli giris testi
  @EDT @EDTNewUser @EDTMultiParam
  Scenario Outline: TC12 editor sayfasina farkli kisileri ekleme
    Given kullanici "editDataTablesURL" sayfasina gider
    Then EDT new bttn basar
    And EDT ilgili kutulara "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>"
    And EDT create bttn basar
    When EDT kullanici "<firstLastName>" ile arama yapar
    Then EDT isim bolumunda "<firstLastName>" oldugunu dogrular
    And sayfayi kapatir

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary | firstLastName |
      | murat     | soner    | TestLead | Paris  | 124       | 2021-12-13 | 60000  | murat soner   |
      | Hakan     | Suna     | QA       | Kenya  | 126       | 2021-12-14 | 40000  | Hakan Suna    |
      | Furkan    | Yilmaz   | QA       | Adana  | 128       | 2021-12-15 | 80000  | Furkan Yilmaz |