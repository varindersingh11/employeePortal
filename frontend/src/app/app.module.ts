import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule, Http } from '@angular/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { EmployeedataComponent } from './employeedata/employeedata.component';
import { FormsModule }   from '@angular/forms';
import {RegisterService} from './register/register.service';
import {EmployeeService} from './employeedata/employee.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegisterComponent,
    EmployeedataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpModule
  ],
  providers: [RegisterService,EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
