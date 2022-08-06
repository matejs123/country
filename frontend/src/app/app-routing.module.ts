import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ComponentTestComponent } from './module/main/component/component-test/component-test.component';
import { EducationComponent } from './module/main/component/country-options/education/education.component';
import { IndustryComponent } from './module/main/component/country-options/industry/industry.component';
import { HomeComponent } from './module/main/component/home/home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'test',
    component: ComponentTestComponent,
  },
  {
    path: 'industry',
    component: IndustryComponent
  },
  {
    path: 'education',
    component: EducationComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
