import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Persona } from 'src/app/Modelo/Persona';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  personas:Persona[] | undefined;
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getPersonas()
    .subscribe(data => {
      this.personas=data;
    });
  }

}

