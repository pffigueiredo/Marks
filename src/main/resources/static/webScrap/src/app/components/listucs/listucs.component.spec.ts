import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListucsComponent } from './listucs.component';

describe('ListucsComponent', () => {
  let component: ListucsComponent;
  let fixture: ComponentFixture<ListucsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListucsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListucsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
