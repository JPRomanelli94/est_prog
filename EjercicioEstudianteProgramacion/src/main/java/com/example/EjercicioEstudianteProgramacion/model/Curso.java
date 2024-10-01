package com.example.EjercicioEstudianteProgramacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private Date fecha_finalizacion;
    @OneToMany(mappedBy="id_curso",fetch = FetchType.LAZY)
    private List<Tema> listaTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, Date fecha_finalizacion, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaTemas = listaTemas;
    }
    
}
