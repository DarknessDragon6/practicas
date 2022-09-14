package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class DenisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenisApplication.class, args);

		ArrayList<User> Usuario = new ArrayList<>();

		System.out.println("Hola");

		for (User usuarios : Usuario) {
			System.out.println(usuarios.getName());
		}
	}

}
