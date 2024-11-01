﻿# LibraryGRPC
 gRPC Middleware 
We want to implement a library service with gRPC middleware. 
 The available methods associated to library service are as follows:
The method add_book. It allows a client to add a book to the library. A book is characterized by its title, the author, its type (e.g. CD, DVD, etc.) as well as a set of keywords that characterize its content. If a client attempts to add a book that already has a saved title, the message “ already_exist” is returned. Otherwise, the message “Added successfully” is returned. 
The method search_book. It allows a client to search all books containing specific keywords.   
1. Propose a .proto file describing the library service and possible exchanged data.    
2. Implement the Library service.
3. Implement gRPC server. 
4. Download BloomRPC tool. Use it as a client to remotely invoke add_book() and search_book() methods.



