package com.example.EjercicioEstudianteProgramacion.service;

import com.example.EjercicioEstudianteProgramacion.model.Tema;

public interface ITemaService {
    
    //metodo para crear un nuevo tema
    public void saveTema (Tema tem);
    
    //metodo para editar un tema
    public void editTema(Tema tem);
    
}
