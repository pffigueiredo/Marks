import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListcourseComponent } from './components/listcourse/listcourse.component';
import { ListucsComponent } from './components/listucs/listucs.component';

@NgModule({
  declarations: [
    AppComponent,
    ListcourseComponent,
    ListucsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
