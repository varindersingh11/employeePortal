import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {RegisterComponent} from './register/register.component';
import {EmployeedataComponent} from './employeedata/employeedata.component'
const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent,
    data: { title: 'Welcome Page' }
  },
  {
    path: 'register',
    component: RegisterComponent,
    data: { title: 'Registeration' }
  },
  {
    path: 'list',
    component: EmployeedataComponent,
    data: { title: 'Listing of Employees' }
  },
  { path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
