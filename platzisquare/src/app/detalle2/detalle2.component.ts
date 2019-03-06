import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LugaresService } from '../services/lugares.service';
import { Lugar } from '../models/lugar';

@Component({
  selector: 'app-detalle2',
  templateUrl: './detalle2.component.html',
  styleUrls: ['./detalle2.component.css']
})
export class Detalle2Component implements OnInit {

  lugares: any = [];
  lugar = {};
  id: number;

  constructor(private route: ActivatedRoute, private lugaresService: LugaresService) {

    // this.lugares = lugaresService.getLugares();

  }

  ngOnInit() {

    // this.lugar = this.lugaresService.buscarLugar(['id']);


    this.route.params.subscribe(params => {
      this.id = params['id'];



    });
   // this.id = this.route.snapshot.params['id'];
    this.lugaresService.getLugar(this.id).valueChanges().subscribe((lugar) => { this.lugar = lugar; });



    // console.log(this.route.snapshot.queryParams['action']);
    // console.log(this.route.snapshot.queryParams['referer']);

  }


}
