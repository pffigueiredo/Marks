import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HttpClientModule} from "@angular/common/http";

import { AppComponent } from './app.component';
import { ListcourseComponent } from './components/listcourse/listcourse.component';
import { ListucsComponent } from './components/listucs/listucs.component';
import { CourseService} from "./shared_service/course.service";


const appRoutes:Routes=[
  {path:'', component:ListcourseComponent},
  {path:'op', component:ListucsComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    ListcourseComponent,
    ListucsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [CourseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
