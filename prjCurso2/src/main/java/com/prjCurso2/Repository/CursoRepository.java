package com.prjCurso2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.prjCurso2.entities.Curso;

public interface  CursoRepository extends JpaRepository<Curso, Long> {
	
}