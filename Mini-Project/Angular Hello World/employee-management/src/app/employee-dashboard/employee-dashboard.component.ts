import { Component, OnInit } from '@angular/core';
import { Employee, EmployeeServiceService } from '../service/employee-service.service';

@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.css']
})
export class EmployeeDashboardComponent implements OnInit {

  employees: Employee[] = [];
  
  constructor(
    private employeeService: EmployeeServiceService
  ) { }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      response => this.employees = response
    );
  }

}
