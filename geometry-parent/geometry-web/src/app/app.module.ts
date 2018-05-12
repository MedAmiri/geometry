import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app/app.component';
import { RoutingComponent } from './routing/routing.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RoutingModule } from './routing.module';
import { MapComponent } from './map/map.component';


@NgModule({
  declarations: [
    AppComponent,
    RoutingComponent,
    HomeComponent,
    LoginComponent,
    MapComponent
  ],
  imports: [
    BrowserModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [RoutingComponent]
})
export class AppModule { }
