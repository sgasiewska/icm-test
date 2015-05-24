Feature: Logowanie jako administrator
Jako niezalogowany użytkownik
Podaję login i hasło przypisane do konta administratora
Żeby zalogować się jako administrator

@LogowanieAdmin
Scenario: Logowanie jako administrator
Given Majac strone logowania
When Loguje sie do systemu poprzez login "icm-admin@icm.com" i haslo "!1" 
Then Powinienem zostac zalogowany jako administrator