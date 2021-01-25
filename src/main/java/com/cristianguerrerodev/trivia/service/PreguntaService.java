package com.cristianguerrerodev.trivia.service;

import com.cristianguerrerodev.trivia.interfaces.PreguntaInterface;
import com.cristianguerrerodev.trivia.model.Pregunta;
import com.cristianguerrerodev.trivia.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService implements PreguntaInterface {

    @Autowired
    PreguntaRepository repository;

    @Override
    public List<Pregunta> recuperarTodas() {
        return (List<Pregunta>) repository.findAll();
    }

    @Override
    public Pregunta recuperarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void insertar(Pregunta p) {
        repository.save(p);
    }

    @Override
    public void eliminar(Pregunta p) {

    }
}
