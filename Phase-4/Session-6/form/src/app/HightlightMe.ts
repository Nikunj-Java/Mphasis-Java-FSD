
import { Directive,ElementRef,Renderer2 } from "@angular/core";

@Directive({selector:'[highlightme]'})
export class HighLightMe{

    constructor(er:ElementRef,render:Renderer2){
        render.setStyle(er.nativeElement,'background-color','yellowgreen');
    }

}