Conferences
===========

soa project 

Projekt jest testowany i uzywany na JBOSS 6  i postgres 9.1 
JBOSS 6 postawiny na 127.0.0.1:8080 
postgres 9.1 postawiony na 127.0.0.1:5432
	Do uruchomiania aplikacji potrzebna jest
	baza danych o nazwie : soa
	urzytkownik 		 : soauser
	haslo dla uzytkownika: soa
	// mozliwe porblemy i rozwiazania w notatkipostgres
	
Aby załadować webservice na server trzeba skopiować plik *.ear (ktory tworzymu prawy na projekcie ConferenceEAR
	eksport -> EAR file) do foldery server/default/deploy .
	
dzialanie mozna przetestowac za pomoca soapui.