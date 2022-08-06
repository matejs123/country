import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IndustryComponentComponent } from './industry-component.component';

describe('IndustryComponentComponent', () => {
  let component: IndustryComponentComponent;
  let fixture: ComponentFixture<IndustryComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IndustryComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IndustryComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
