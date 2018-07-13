import { Injectable } from '@angular/core';
import { HttpClient} from "@angular/common/http";


import {Observable} from "rxjs/index";
import {Course} from "../course";

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private URL= "http://localhost:8080";

  constructor( protected httpClient: HttpClient,
  ) { }

  public list(): Observable<Array<Course>> {
    return this.httpClient.get<Array<Course>>(this.URL+'/teste');
  }


}
