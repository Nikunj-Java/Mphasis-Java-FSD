import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DataService } from './data.service';
import { RegisterComponent } from './register/register.component';
import { ServiceComponent } from './service/service.component';
import { DirectivesComponent } from './directives/directives.component';
import { ChangeColorDirective } from './ChangeColorDirective';
import { HighLightDirective } from './HighLightDirective';
import { Directives2Component } from './directives2/directives2.component';
import { MyColor } from './MyColor';
import { HighLightMe } from './HightlightMe';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ServiceComponent,
    DirectivesComponent,
    ChangeColorDirective,
    HighLightDirective,
    Directives2Component,
    MyColor,
    HighLightMe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
