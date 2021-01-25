package com.cristianguerrerodev.trivia.interfaces;

import com.cristianguerrerodev.trivia.model.Pregunta;

import java.util.List;

public interface PreguntaInterface{

    public List<Pregunta> recuperarTodas();
    public Pregunta recuperarPorId(Long id);
    public void insertar(Pregunta p);
    public void eliminar(Pregunta p);
}
