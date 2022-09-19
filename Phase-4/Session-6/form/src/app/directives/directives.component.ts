import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{"name":"Nikunj Soni","email":"nikunj@gmail.com"},
  {"name":"Alex","email":"alex@gmail.com"},
  {"name":"Jhon","email":"jhon@gmail.com"},
  {"name":"Sujal","email":"sujal@gmail.com"},
  {"name":"Baljeet","email":"baljeet@gmail.com"},
  {"name":"Mohan","email":"mohan@gmail.com"},
  {"name":"Rorisang","email":"rorisang@gmail.com"},
  {"name":"Arvind","email":"arvind@gmail.com"},
]

flag=false;

show(){
  this.flag=!this.flag;
}

public day= new Date().getDay();
}
