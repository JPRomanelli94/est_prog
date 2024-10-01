package com.example.EjercicioEstudianteProgramacion.service;

import com.example.EjercicioEstudianteProgramacion.model.Tema;
import com.example.EjercicioEstudianteProgramacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private ITemaRepository temaPersis;
    
    @Override
    public void saveTema(Tema tem) {
        temaPersis.save(tem);
    }

    public void editTema(Tema tem) {
        this.saveTema(tem);
    }
    
    
    
}
