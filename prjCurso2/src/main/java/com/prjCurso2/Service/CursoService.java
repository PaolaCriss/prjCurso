package com.prjCurso2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjCurso2.Repository.CursoRepository;
import com.prjCurso2.entities.Curso;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    //construtor que recebe a dependencia
    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}

