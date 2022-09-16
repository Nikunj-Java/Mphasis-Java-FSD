import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{name:"pencile",price:"8.3",available:"16-09-2022",ratings:4.8},
            {name:"pen",price:"10",available:"17-09-2022",ratings:5.0},
            {name:"eraser",price:"5.3",available:"20-09-2022",ratings:4.2},
            {name:"scale",price:"8.0",available:"16-09-2022",ratings:4.9},
            {name:"books",price:"12",available:"30-09-2022",ratings:4.7},
          ];
  name:string="NIKUNJ SONI";
  url:string="http://www.google.com";
  we:number=700;

  flag=false;
  show(){
    this.flag=!this.flag;
  }

}
