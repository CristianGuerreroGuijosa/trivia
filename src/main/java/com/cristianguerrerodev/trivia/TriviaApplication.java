package com.cristianguerrerodev.trivia;

import com.cristianguerrerodev.trivia.model.Pregunta;
import com.cristianguerrerodev.trivia.model.Respuesta;
import com.cristianguerrerodev.trivia.service.PreguntaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TriviaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriviaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(PreguntaService preguntaService){
        return args -> {
            Pregunta pregunta = new Pregunta("Cultura", "¿En que año se estrenó la pelicula \"Pulp Fiction\"?");
            pregunta.addAnswer(new Respuesta("1996", true));
            pregunta.addAnswer(new Respuesta("1992", false));
            pregunta.addAnswer(new Respuesta("1979", false));
            pregunta.addAnswer(new Respuesta("1920", false));
            pregunta.addAnswer(new Respuesta("2000", false));

            preguntaService.insertar(pregunta);
        };
    }

}
