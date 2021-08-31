import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/Persona';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }

  Guardar(persona:Persona){
    this.service.createPersonas(persona)
    .subscribe(data => {
      alert("Agregado con exito");
      this.router.navigate(["listar"]);
    });
  }

}
