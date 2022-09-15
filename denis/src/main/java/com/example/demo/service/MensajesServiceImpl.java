package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Mensajes;
import com.example.demo.repository.MensajesRepository;

@Service("mensajesservice")
public class MensajesServiceImpl implements MensajesService {

	@Autowired
	@Qualifier("mensajesRepository")
	private MensajesRepository mensajesRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Mensajes> findAll() {

		return mensajesRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Mensajes> findAll(Pageable pageable) {

		return mensajesRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Mensajes> findById(Long id) {

		return mensajesRepository.findById(id);
	}

	@Override
	@Transactional
	public Mensajes save(Mensajes mensajes) {

		return mensajesRepository.save(mensajes);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		mensajesRepository.deleteById(id);

	}

	@Override
	public List<Mensajes> listAllMensajes() {

		return mensajesRepository.findAll();
	}

	@Override
	public Mensajes addmensajes(Mensajes mensajes) {

		return mensajesRepository.save(mensajes);
	}

}
