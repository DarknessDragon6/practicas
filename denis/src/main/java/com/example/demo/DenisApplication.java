package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Mensajes;
import com.example.demo.service.MensajesService;

@SpringBootApplication
public class DenisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenisApplication.class, args);

		ArrayList<Mensajes> mensajes = new ArrayList<>();

		System.out.println("Hola");

		for (Mensajes mensaje : mensajes) {
			System.out.println(mensaje.getPais());
		}
	}

}
