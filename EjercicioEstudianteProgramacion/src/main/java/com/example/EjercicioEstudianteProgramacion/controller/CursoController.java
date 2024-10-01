package com.example.EjercicioEstudianteProgramacion.controller;

import com.example.EjercicioEstudianteProgramacion.dto.CursoTemaDTO;
import com.example.EjercicioEstudianteProgramacion.model.Curso;
import com.example.EjercicioEstudianteProgramacion.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private CursoService curServ;
    
    //para crear nuevos cursos
    @PostMapping("/crear/curso")
    public String crearCurso(@RequestBody Curso cur){
        curServ.saveCurso(cur);
        return "Curso creado exitosamente";
    }
    
    //para obtener todos los cursos
    @GetMapping("/buscar/cursos")
    public List<Curso> buscarCurso(){
        return curServ.getCursos();
    }
    
    //para obtener todos los temas de un determinado curso
    @GetMapping("/buscar/temas/{id_curso}")
    public CursoTemaDTO buscarTemasDTO(@PathVariable Long id_curso){
        return curServ.temasPorCurso(id_curso);
    }
    
     //para obtener todos los temas de un determinado curso
    @GetMapping("/buscar/cursos/java")
    public List<Curso> buscarCursosJava(){
        return curServ.getCursosJava();
    }
    
    //Endpoint para modificar un curso
    @PutMapping("/cursos/editar")
    public String editCurso(@RequestBody Curso cur){
        curServ.editCurso(cur);
        
        return "Curso editado correctamente";
    }   
}