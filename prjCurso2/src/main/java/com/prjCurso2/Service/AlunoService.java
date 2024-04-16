package com.prjCurso2.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjCurso2.Repository.AlunoRepository;
import com.prjCurso2.entities.Aluno;


@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    //construtor que recebe a dependencia
    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public List<Aluno> getAllAluno() {
        return alunoRepository.findAll();
    }

    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}

