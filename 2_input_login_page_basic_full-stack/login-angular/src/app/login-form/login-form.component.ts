import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from './login-model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.view.html',
  styleUrl: './login-form.component.css'
})

export class LoginFormComponent {

  user: User = new User();

  httpClient: any;

  constructor(_httpClient: HttpClient) {
    this.httpClient = _httpClient;
    this.user.userName = "Ashwin";
    this.user.passWord = "TheKing";
  }

  onSubmit(loginForm: NgForm) {
    console.log(loginForm.value);
  }

  SuccessGet(res: any) {
    console.log('Inside the success function : ');
    console.log(res.message);
  }

  onClick() {
    this.httpClient.post('http://localhost:8080/api/auth/signin', { "userName": "Ashwin", "passWord": "King" }).
    subscribe((res: User) => this.SuccessGet(res));
  }
}
