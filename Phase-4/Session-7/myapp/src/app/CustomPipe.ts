import {Pipe,PipeTransform} from "@angular/core"

@Pipe({name:'changestring'})
export class CustomPipe implements PipeTransform{
    
    transform(value: string,character:string) {
        return value.split(character).join("-")
}

}