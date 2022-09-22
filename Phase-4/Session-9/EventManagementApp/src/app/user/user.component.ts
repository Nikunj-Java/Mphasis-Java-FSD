import { Component, OnInit } from '@angular/core';
import { CrudHttpService } from '../crud-http.service';
import { User } from '../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  title = 'EventManagementApp';
  todo={id:"",firstname:"",lastname:"",email:""}
  todoList:any = [];

  constructor(private crudHttpService: CrudHttpService,private router:Router) { }

  ngOnInit(): void {
    
  }
  //user:User= new User();
  isBookAdded = false;
  user = {
    id: '',
    firstname:'',
    lastname:'',
    email: '',
  };
  createTodo(){
    let data = {
      //id: new Date().getTime(),
      firstname:this.user.firstname ,
      lastname:this.user.lastname,
      email:this.user.email,
    }
     
     this.crudHttpService.create(data).subscribe(result=>this.todoList=
      
    this.router.navigateByUrl('/admin'));
     
  }
}
