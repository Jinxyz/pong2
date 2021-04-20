MVC

Model 
serverModel - Öppna upp server och lyssna efter connnections
clientModel - Connecta till en server via IP och port


Controller
mainController - kör serverController, clientController, och view. 
serverController - kör serverModel, socket
clientController - kör clientModel, socket


View
JFrame för spelets "boundingbox", där alla väggar har collision och inte går att åka förbi. 


Nätverk
Server öppnar upp sig för en connection och väntar tills en klient ansluter.

Client letar efter en connection, behöver en port och en IP att ansluta till. 