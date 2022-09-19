 import {Directive,ElementRef} from "@angular/core";

 @Directive({selector:'[changecolor]'})
 
export class ChangeColorDirective{
    constructor(er:ElementRef){
        er.nativeElement.style.color="green";
    }
}