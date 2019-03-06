import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Lugares2Component } from './lugares2.component';

describe('Lugares2Component', () => {
  let component: Lugares2Component;
  let fixture: ComponentFixture<Lugares2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Lugares2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Lugares2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
