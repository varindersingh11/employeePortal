import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Inject } from '@angular/core'; 

@Injectable({
    providedIn: 'root',
  })
export class RegisterService {
  constructor(@Inject(Http) private  http:  Http) { 
}

getBaseUrl() {
  return "http://localhost:8080/api";
}

  saveEmployee(employee){
    return this.http.post(this.getBaseUrl() + '/register', employee);
  }
}

