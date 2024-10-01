package com.example.EjercicioEstudianteProgramacion.service;

import com.example.EjercicioEstudianteProgramacion.dto.CursoTemaDTO;
import com.example.EjercicioEstudianteProgramacion.model.Curso;
import com.example.EjercicioEstudianteProgramacion.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {
    
    @Autowired
    private ICursoRepository curPersis;
    
    @Override
    public void saveCurso(Curso cur) {
        curPersis.save(cur);
    }

    @Override
    public List<Curso> getCursos() {
        return curPersis.findAll();
    }

    @Override
    public Curso cursoPorId(Long id_curso) {
        return curPersis.findById(id_curso).orElse(null);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        Curso cursoCompleto = this.cursoPorId(id_curso);
        
        CursoTemaDTO curTemDTO = new CursoTemaDTO ();
        curTemDTO.setNombreCurso(cursoCompleto.getNombre());
        curTemDTO.setListaTemas(cursoCompleto.getListaTemas());
        
        return curTemDTO;
    }

    @Override
    public List<Curso> getCursosJava() {
        List<Curso> allCursos = this.getCursos();
        List<Curso> listaDefinitiva = new ArrayList<>();
        for (Curso cur : allCursos){
            String nombreComparar = cur.getNombre();
            if (nombreComparar.contains("Java")){
                listaDefinitiva.add(cur);
        }            
        }
        
        return listaDefinitiva;
    }

    public void editCurso(Curso cur) {
        this.saveCurso(cur);
    }
    
}
