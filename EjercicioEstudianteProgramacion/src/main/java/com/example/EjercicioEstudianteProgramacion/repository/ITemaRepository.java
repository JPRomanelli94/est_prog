package com.example.EjercicioEstudianteProgramacion.repository;

import com.example.EjercicioEstudianteProgramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long>{
    
}
