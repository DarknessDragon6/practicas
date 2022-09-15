package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.Mensajes;

public interface MensajesService {
	
	public abstract List<Mensajes> listAllMensajes();
	
	public abstract Mensajes addmensajes(Mensajes mensajes);

	public Iterable<Mensajes> findAll();

	public Page<Mensajes> findAll(Pageable pageable);

	public Optional<Mensajes> findById(Long id);

	public Mensajes save(Mensajes mensajes);

	public void deleteById(Long id);
	
}
