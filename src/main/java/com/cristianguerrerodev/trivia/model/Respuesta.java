package com.cristianguerrerodev.trivia.model;

import javax.persistence.*;

@Entity
@Table(name = "respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String texto;
    private boolean correcta;

    public Respuesta() {
    }

    public Respuesta(String texto, boolean correcta) {
        this.texto = texto;
        this.correcta = correcta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", correcta=" + correcta +
                '}';
    }
}
