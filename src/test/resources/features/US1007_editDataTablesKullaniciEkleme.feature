Feature: US1007 edit DataTables kullanici ekleme testi
  
  @EDT @EDTAddNewUser
  Scenario Outline: TC11 farkli kullanici datalari ile kullanici ekleme testi
    Given kullanici "editDataTablesURL" sayfasina gider
    Then EDT new bttn basar
    And EDT firstname kutusuna "<firstName>" girer
    And EDT lastname kutusuna "<lastName>" girer
    And EDT position kutusuna "<position>" girer
    And EDT office kutusuna "<office>" girer
    And EDT extension kutusuna "<extension>" girer
    And EDT startdate kutusuna "<startDate>" girer
    And EDT salary "<salary>" girer
    And EDT create bttn basar
    When EDT kullanici "<firstLastName>" ile arama yapar
    Then EDT isim bolumunda "<firstLastName>" oldugunu dogrular
    And sayfayi kapatir

    
    
    Examples:
    |firstName|lastName|position|office|extension|startDate|salary|firstLastName|
    |murat  |soner     |TestLead|Paris |124      |2021-12-13|60000|murat soner  |
    |Hakan  |Suna     |QA|Kenya |126      |2021-12-14|40000|Hakan Suna          |
    |Furkan  |Yilamz     |QA|Adana |128      |2021-12-15|80000|Furkan Yilmaz    |