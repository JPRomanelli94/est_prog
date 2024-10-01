package com.example.EjercicioEstudianteProgramacion.controller;

import com.example.EjercicioEstudianteProgramacion.model.Tema;
import com.example.EjercicioEstudianteProgramacion.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    
    @Autowired
    private TemaService temServ;
    
    //Generamos nuevos temas
    @PostMapping("/crear/tema")
    public String crearTema(@RequestBody Tema tem){
        temServ.saveTema(tem);
        return "Tema creado exitosamente";
    }
    
    //Endpoint para modificar un tema
    @PutMapping("/temas/editar")
    public String editTema(@RequestBody Tema tem){
        temServ.editTema(tem);
        
        return "Tema editado correctamente";
    }   
    
}
