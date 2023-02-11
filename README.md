# EmployeeManagement-SpringBoot
Employee Management Application

Technologies:-
I.Backend:-
  •	Java
  •	Spring Boot
II.	Frontend:-
  •	HTML & CSS
  •	JavaScript
  •	Angular & TypeScript
III.	Other:-
  •	HTTP
  •	CLI
  •	Database
  •	Postman


//*************************Notes*************************//

Backend
•	The model ‘Employee’ class is implementing ‘Serializable’  because ‘Serializable’ helps transform java class into different types of streams, because  this class is going to be saved in a database and then its going to be sent to the front as JSON so its always best to make classes that are going to be in different kinds f stream implemented ‘Serializable’ because it helps with this whole process.
•	@Column(nullable = false, updatable = false)  This means column value can not null and can not be updated once set.

CorsFilter
•	 Cross-Origin Resource Sharing (CORS) is a security concept that allows restricting the resources implemented in web browsers. 
•	It prevents the JavaScript code producing or consuming the requests against different origin.
•	For example, your web application is running on 8080 port and by using JavaScript you are trying to consuming RESTful web services from 9090 port. Under such situations, you will face the Cross-Origin Resource Sharing security issue on your web browsers.
•	Two requirements are needed to handle this issue –
o	RESTful web services should support the Cross-Origin Resource Sharing.
o	RESTful web service application should allow accessing the API(s) from the 8080 port.

Frontend
•	Base url is stored in environment folder in environment file of development, since we are in localhost right now.
o	‘environment.ts’  environment file for development
o	‘environment.prod.ts’  environment file for production

•	//service code
•	public getEmployees() {
•	    this.employeeService.getEmployees().subscribe(
•	      (respose: Employee[]) => {
•	        this.employees = respose;
•	      },
•	      (error: HttpErrorResponse) => {
•	        alert(error.message);
•	      }
•	    );
•	In above code, since getEmployee service is an observable its gonna make a request over the internet or or the network and its gonna take some time that’s why it returns an observable, so we need to subscribe to that observable. So that we can be notified when some data comes ack from server (either employees or some kind of error).
•	Inside subscribe we have two possible scenarios, either we get response from server or we get error. 
•	‘=>{} ‘ kind of defines an inline function telling what to do when we get response or error.
•	If we get response then we store it in employees array in component and if we get error we send it to alert.
