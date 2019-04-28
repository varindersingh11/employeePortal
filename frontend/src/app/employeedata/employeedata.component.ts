import { Component, OnInit } from '@angular/core';
import { Http,Response } from '@angular/http';
import { Employee } from '../model/employee.model';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employeedata',
  templateUrl: './employeedata.component.html',
  styleUrls: ['./employeedata.component.css']
})
export class EmployeedataComponent implements OnInit {

  public employeesList : Employee[] = [];
  public errorMessage : string = "";
  constructor(private  employeeService:  EmployeeService){}

  ngOnInit() {
   this.getEmployeeList();
    }

  getEmployeeList() {
      this.employeeService.getAllEmployees().subscribe(
        response =>this.employeesList = response.json()
      );
      }

 

}
