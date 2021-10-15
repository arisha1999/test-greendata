# REST API for Greendata
### **Summary:** Bank services REST API
### **Requirements:** 
+ Language - Java 8
+ Framework - Spring boot
+ Build tool - Maven
+ Submit sources via a public git repository

### **Working features**
Once you run the application stack, you should be able access the public routes below:
| FEAUTURE | TYPE | ROUTE |
|:---------:|:---------:|:---------:|
| Get all banks | GET | http://localhost:8000/banks |
| Save bank | POST | http://localhost:8000/banks |
| Get bank by id | GET | http://localhost:8000/banks/{id} |
| Update bank | PUT | http://localhost:8000/banks/{id} |
| Delete bank by id| DELETE | http://localhost:8000/banks/{id} |
| Get all clients | GET | http://localhost:8000/clients |
| Save client | POST | http://localhost:8000/clients |
| Get client by id | GET | http://localhost:8000/clients/{id} |
| Update client | PUT | http://localhost:8000/clients/{id} |
| Delete client by id| DELETE | http://localhost:8000/clients/{id} |
| Get all deposits | GET | http://localhost:8000/deposits |
| Save deposit | POST | http://localhost:8000/deposits |
| Get deposit by id | GET | http://localhost:8000/deposits/{id} |
| Update deposit | PUT | http://localhost:8000/deposits/{id} |
| Delete deposit by id| DELETE | http://localhost:8000/deposits/{id} |
