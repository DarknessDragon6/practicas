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

		ArrayList<Mensajes> mensaje = new ArrayList<>();

		System.out.println("Hola");

		for (Mensajes mensajes : mensaje) {
			System.out.println(mensajes.getPais());
		}
	}

}
