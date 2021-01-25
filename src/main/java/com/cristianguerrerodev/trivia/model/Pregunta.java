package com.cristianguerrerodev.trivia.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String categoria;
    private String texto;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;

    public Pregunta() {
    }

    public Pregunta(String categoria, String texto, List<Respuesta> respuestas) {
        this.categoria = categoria;
        this.texto = texto;
        this.respuestas = respuestas;
    }

    public Pregunta(String categoria, String texto) {
        this.categoria = categoria;
        this.texto = texto;
        this.respuestas = new ArrayList<Respuesta>();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void addAnswer(Respuesta respuesta) {
        if (respuesta != null) {
            this.respuestas.add(respuesta);
        }

    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", texto='" + texto + '\'' +
                ", respuestas=" + respuestas +
                '}';
    }
}
