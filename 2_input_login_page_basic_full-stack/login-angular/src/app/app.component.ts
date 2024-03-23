import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  constructor(private http: HttpClientModule) {
  }

  onSubmit(form: NgForm) {
    const headers = { 'content-type': 'application/json'};
    console.log('Your form data : ', form.value);

    return this.http.post('http://localhost:8080/api/auth/signin' + 'user', {"userName":"Ashwin","passWord":"King"},{'headers':headers})
  }
}
