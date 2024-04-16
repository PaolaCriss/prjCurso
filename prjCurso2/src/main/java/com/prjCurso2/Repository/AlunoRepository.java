package com.prjCurso2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjCurso2.entities.Aluno;

public interface  AlunoRepository extends JpaRepository<Aluno, Long> {

}
