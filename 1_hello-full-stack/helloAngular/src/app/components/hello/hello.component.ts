import { Component, OnInit } from '@angular/core';
import { HelloService } from '../../services/hello.service';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrl: './hello.component.css'
})
export class HelloComponent {

  public helloResponse:any;

  constructor(private _helloService:HelloService){}

  ngOnInit(){
    this._helloService.helloService().subscribe((res: any)=>this.helloResponse=res);
  }
}
