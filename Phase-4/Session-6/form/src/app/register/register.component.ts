import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators } from '@angular/forms';
import { DataService } from '../data.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

   
  //declare formgroup variables
  registerForm: FormGroup;

  //declare boolean variable to get form submitted  or not?
  submitted:boolean=false;

  //inject formbuilder dependency to create form with validators
  constructor(private builder:FormBuilder,private service:DataService) { }

  //when component initiate we will write code here to build form with validators
  ngOnInit(): void {

    this.registerForm= this.builder.group(
      {
        firstName:["",Validators.required],
        lastName:["",Validators.required],
        email:["",[Validators.required,Validators.email]],
        password:["",[Validators.required,Validators.minLength(8)]]
      }
    );
     
  }


  //when usewr will click on submit button - method will be called
  OnSubmit(){
    this.submitted=true;
    if(this.registerForm.invalid)
      return;
    else
      alert("Form Submitted Successfully");
  }

  //to access the  form control in a view to display the error
  get f(){
    return this.registerForm.controls;
  }

}
