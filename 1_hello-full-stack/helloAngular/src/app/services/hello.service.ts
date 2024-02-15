import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { setThrowInvalidWriteToSignalError } from '@angular/core/primitives/signals';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor(private _httpClient:HttpClient) { }
  
  public helloService():any{
    return this._httpClient.get('http://localhost:8080/hello/Ashwin');
  }
}
