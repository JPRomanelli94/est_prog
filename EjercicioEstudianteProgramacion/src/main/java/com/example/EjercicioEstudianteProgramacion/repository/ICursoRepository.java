package com.example.EjercicioEstudianteProgramacion.repository;

import com.example.EjercicioEstudianteProgramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository  extends JpaRepository<Curso,Long>{
    
}
