import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { EditComponent } from './edit/edit.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path:"admin",component:AdminComponent},
  {path:"user",component:UserComponent},
  {path:"edit",component:EditComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
