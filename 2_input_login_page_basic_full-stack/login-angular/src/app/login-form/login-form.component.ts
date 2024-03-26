import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from './login-model';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.view.html',
  styleUrl: './login-form.component.css'
})

export class LoginFormComponent {

  user : User = new User();

  season :String = "Summer";


  onSubmit(loginForm: NgForm) {
    console.log(loginForm.value);
  }
  

  onClick() {
    console.log("Click method is called");
    console.log(this.user.userName);
    console.log(this.user.passWord);
    console.log(this.season);
  }
}
