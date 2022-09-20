import { Directive,ElementRef } from "@angular/core";
@Directive({selector:'[mycolor]'})

export class MyColor{
    constructor(er:ElementRef){
        er.nativeElement.style.color="orange";
    }
}