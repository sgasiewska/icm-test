Feature: Usuwanie uzytkownika
Jako administrator,
chce moc usuwac pracownika lub uzytkownika
by nieupowaznione osoby nie mialy dostepu do systemu ICM

@UsuwanieUzytkownika
Scenario: Usuwanie uzytkownika z listy
Given Wybierajac opcje uzytkownicy z menu gornego
When Wybieram akcje Delete przy uzytkowniku
Then uzytkownik powinien zniknac z listy pacownikow
Then powinien pojawia sie komunikat potwierdzajacy usuniecie uzytkownika