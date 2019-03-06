import { Component, OnInit } from '@angular/core';
import { LugaresService } from '../services/lugares.service';
import { HttpClient } from 'selenium-webdriver/http';

@Component({
  selector: 'app-lugares2',
  templateUrl: './lugares2.component.html',
  styleUrls: ['./lugares2.component.css']
})
export class Lugares2Component {
  title = 'platzisquare';
  lat = -31.4157706;
  lng = -64.193723;
  lugares = null;

  constructor(private lugaresService: LugaresService, private http: HttpClient ) {
    lugaresService.getLugares().valueChanges()
      .subscribe(lugares => {
      this.lugares = lugares;

      });

  }


}
