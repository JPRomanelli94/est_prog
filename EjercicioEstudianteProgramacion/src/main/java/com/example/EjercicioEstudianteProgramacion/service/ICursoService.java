package com.example.EjercicioEstudianteProgramacion.service;

import com.example.EjercicioEstudianteProgramacion.dto.CursoTemaDTO;
import com.example.EjercicioEstudianteProgramacion.model.Curso;
import java.util.List;

public interface ICursoService {
    
    //metodo para crear un nuevo curso
    public void saveCurso (Curso cur);
    
    //metodo para traer todos los cursos
    public List<Curso> getCursos ();
    
    //metodo para traer todos los temas de un curso
    public CursoTemaDTO temasPorCurso(Long id_curso);
    
    //metodo para traer x curso por su id
    public Curso cursoPorId (Long id_curso);
    
    //metodo para traer los cursos que contengan el nombre Java
    public List<Curso> getCursosJava();
    
    //modificamos un curso existente
    public void editCurso(Curso cur);

}
