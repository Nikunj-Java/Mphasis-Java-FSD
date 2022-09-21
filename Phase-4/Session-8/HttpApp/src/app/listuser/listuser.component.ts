import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { UserClass } from '../UserClass';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {

  //inject the service
  constructor(private service:DataService) { }

  users:UserClass[];

  ngOnInit(): void {

    this.service.getAllUsers().subscribe(result=>this.users=result);
   
  }

}
