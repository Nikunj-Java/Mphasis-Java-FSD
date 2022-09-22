import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';

import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path:"admin",component:AdminComponent},
  {path:"user",component:UserComponent},
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
