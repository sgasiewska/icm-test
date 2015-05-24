Feature: Przypisywanie incydentu do pracownika 
Jako administrator
Chce przypisać incydent w statusie Zgloszonym do pracownika
By się nim zajął

Scenario: Przypisywanie incydentu w statusie Zgłoszony do pracownika 
Given Bedac na liście incydentow
Given Majac incydent w statusie zgloszonym
When klikam przycisk Akcje
When Wybieram opcje Dodaj audyt
When W polu przypisz do wybieram pracownika
When Klikam przycisk Dodaj audyt
Then Zgłoszenie zostaje przypisane do pracownika
Then Pojawia sie komunikat informujący o dodaniu audytu