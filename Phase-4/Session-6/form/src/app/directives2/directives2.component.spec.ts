import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Directives2Component } from './directives2.component';

describe('Directives2Component', () => {
  let component: Directives2Component;
  let fixture: ComponentFixture<Directives2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Directives2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Directives2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
