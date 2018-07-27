import { Component, OnInit } from '@angular/core';
import {CourseService} from "../../shared_service/course.service";
import {Course} from "../../course";

@Component({
  selector: 'app-listcourse',
  templateUrl: './listcourse.component.html',
  styleUrls: ['./listcourse.component.css']
})
export class ListcourseComponent implements OnInit {

  private courses:Course[];
  constructor(private _courseService:CourseService) { }

  allDataFetched: boolean = false;

  ngOnInit() {
    this._courseService.list().subscribe((courses)=>{
      console.log(courses);
      this.allDataFetched = true;
    },(error)=>{
      console.log(error);
    })

  }

}
