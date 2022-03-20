package com.angular.MyProject.controller;

import java.util.ArrayList;
import java.util.List;

import com.angular.MyProject.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

  @GetMapping("/getEmployeeDetail")
    public List<Employee> getEmpDetails(){
      return persistEmpData();
    }

    public static List<Employee> persistEmpData(){
      List<Employee> employeeList = new ArrayList<>();
      Employee e1 = new Employee();
      e1.setEmpId("I21014");
      e1.setName("Nataraj M");
      e1.setDesignation("Senior Software Engineer");
      e1.setSalary(1000000);

      employeeList.add(e1);
      Employee e2 = new Employee();
      e2.setEmpId("I19014");
      e2.setName("Thilak");
      e2.setDesignation("Senior Software Engineer");
      e2.setSalary(1300000);
      employeeList.add(e2);
      employeeList.add(e2);

      return employeeList;
    }
}
