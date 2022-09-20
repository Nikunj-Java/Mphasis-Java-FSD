import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  name:string="My Name is Nikunj And i am a JAVA FSD Trainer";
  pi: number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today=new Date();
  object= {name:"Nikunj",email:"nikunj@gmail.com",address:"Mumbai"};

  //custompipes
  cust:string="Welcome to the world of customPipes";
  

}
