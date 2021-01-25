package com.cristianguerrerodev.trivia.repository;

import com.cristianguerrerodev.trivia.model.Pregunta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {
}
