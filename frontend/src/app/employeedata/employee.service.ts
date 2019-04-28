import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Inject } from '@angular/core'; 

@Injectable({
    providedIn: 'root',
  })
export class EmployeeService {
  constructor(@Inject(Http) private  http:  Http) { 
}

getBaseUrl() {
  return "http://localhost:8080/api";
}

  getAllEmployees(){
   return this.http.get(this.getBaseUrl() + "/getEmployees");
}
}

