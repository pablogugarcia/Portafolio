import { Injectable } from '@angular/core';
import { AngularFireDatabase } from '@angular/fire/database';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class LugaresService {
  /*lugares: any = [
    {
      id: 1, cercania: 1, distancia: 10, active: true, name: 'Floreria la Gardenia',
      plan: 'pagado', descripcion: 'Descripcion proximamente..'
    },
    {
      id: 2, cercania: 2, distancia: 40, active: true, name: 'Donas la pasadita',
      plan: 'gratuito', descripcion: 'Descripcion proximamente..'
    },
    {
      id: 3, cercania: 3, distancia: 20, active: true, name: 'Veterinaria huellitas felices',
      plan: 'pagado', descripcion: 'Descripcion proximamente..'
    },
    {
      id: 4, cercania: 2, distancia: 40, active: true, name: 'Franstacionar', plan: 'gratuito'
      , descripcion: 'Descripcion proximamente..'
    },
    { id: 5, cercania: 3, distancia: 20, active: true, name: 'El gallo alegre', plan: 'pagado'
    , descripcion: 'Descripcion proximamente..' }
  ]; */
  API_ENDPOINT = 'https://platzisquare-92d96.firebaseio.com';
  lugares: any = this.afDB.list('lugares2/');
  idProv: any = null;
  constructor(private afDB: AngularFireDatabase, private http: HttpClient) {

  }

  public getLugares() {
    return this.afDB.list('lugares2/');
  }
  public buscarLugar(id: any): any {

    return this.afDB.database.ref('lugares2/' + id.id);

    // return this.lugares.find(lugar => lugar.id === id);

  }
  public guardarLugar(lugar) {
    console.log(lugar);
    this.afDB.database.ref('lugares2/' + lugar.id).set(lugar);
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    this.http.post(this.API_ENDPOINT + '/lugares.json', lugar, { headers: headers }).subscribe();
  }
  public getLugar(id) {

    return this.afDB.object('lugares2/' + id);
  }
}
