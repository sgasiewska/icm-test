Feature: Reset bazy danych
Jako niezalogowany uzytkownik
Po wejściu na stronę "http://localhost:9998/setup"
Baza danych programu ICM zostanie zresetowana
Aby testy były powtarzalne

Scenario: Reset bazy danych
Given Wchodzac na strone http://localhost:9998/setup
When Klikajac przycisk Inicjalizuj
Then Baza danych programu zostanie zresetowana
