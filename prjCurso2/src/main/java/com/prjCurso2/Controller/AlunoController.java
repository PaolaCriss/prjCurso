package com.prjCurso2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjCurso2.Service.AlunoService;
import com.prjCurso2.entities.Aluno;

@RestController
@RequestMapping("/produtos")

public class AlunoController {
    private final AlunoService alunoService;

    @Autowired
    public  AlunoController( AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public  Aluno createProduct(@RequestBody  Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }

    @GetMapping("/{id}")
    public  Aluno getAluno(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @GetMapping
    public List< Aluno> getAllProdutos() {
        return alunoService.getAllAluno();
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
    	 alunoService.deleteAluno(id);
    }
}

