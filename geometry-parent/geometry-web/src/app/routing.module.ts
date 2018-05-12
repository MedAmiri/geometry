import { AppComponent } from './app/app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'app', component: AppComponent},
    {path: 'login', component: LoginComponent}];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
   exports: [RouterModule],
  declarations: []
})
export class RoutingModule { }
