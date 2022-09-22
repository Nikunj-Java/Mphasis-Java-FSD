import { Component, OnInit } from '@angular/core';
import { CrudHttpService } from '../crud-http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  title = 'EventManagementApp';

  todoList:any = [];


  constructor(private crudHttpService: CrudHttpService,private router:Router){}

  
  ngOnInit(): void {
    this.listTodos();
  }

  listTodos(){
    this.crudHttpService.list().subscribe((response)=>{
      this.todoList = response;
    },(error=>{

    }));
  }

  createTodo(){
    let todo = {
      id: new Date().getTime(),
      firstname:`Nikunj ` ,
      lastname:'Soni',
      email:`nikunj@gmail.com`,
    }
    this.crudHttpService.create(todo).subscribe((response)=>{
      this.listTodos();
    },(error=>{

    }));
  }

  user = {
    id: '',
    firstname:'',
    lastname:'',
    email: '',
  };
  isBookAdded = true;
  flag=false;
  show(){
    this.flag=!this.flag;
  }

  update(newuser:any){
    let data = {
      id:this.user.id,
      firstname:this.user.firstname ,
      lastname:this.user.lastname,
      email:this.user.email,
    }
     
    this.crudHttpService.update(newuser.id,data).subscribe(
      result=>this.todoList=
      
    this.router.navigateByUrl('/admin')
    );
  }
  /*editTodo(todo: any){
    let data = {
      id: new Date().getTime(),
      title:`Some Todo` 
    }
    this.crudHttpService.update(todo.id,data).subscribe((response)=>{
      this.listTodos();
    },(error=>{

    }));
  }*/



  deleteTodo(id: any){
    this.crudHttpService.delete(id).subscribe((response)=>{
      this.listTodos();
    },(error=>{
    }));
  }

}
