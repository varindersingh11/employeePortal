import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee.model';
 import { RegisterService } from './register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent  {

  constructor(private registerService : RegisterService){}

  public showSuccessMsg: boolean = false;

onSubmit(employee:Employee){
    this.registerService.saveEmployee(employee).subscribe(status=> {
    if(status.status == 200){
      this.showSuccessMsg = true;
    }
  }
);
  }


}
