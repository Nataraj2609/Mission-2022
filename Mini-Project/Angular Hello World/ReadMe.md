https://www.javainuse.com/angular/ang7

	npm install -g @angular/cli

To create a new angular PROJECT

	ng new employee-management

To start server - ng serve

------------------------------------------------------------------

Create employee component

ng g c employee

Next in the app-routing.module.ts we will be defining the url for accessing this component-

import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';

	const routes: Routes = [
	  { path: '', component: EmployeeDashboardComponent },
	];

Create employee HTTPClient Service

ng g s service/employee-service

Declare a Employee model class inside this service class itself

	export class EmployeeServiceService {

	  constructor(
	    private httpClient:HttpClient
	  ) { }

	  getEmployees()
	  {
	    console.log("test call");
	    return this.httpClient.get<Employee[]>('http://localhost:8080/getEmployeeDetail');
	  }
	}


