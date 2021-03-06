import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../Modelo/Persona';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/fidelizacion/personas';

  getPersonas(){
    return this.http.get<Persona[]>(this.Url);
  }

  createPersonas(persona:Persona){
    return this.http.post<Persona>(this.Url, persona);
  }
}
