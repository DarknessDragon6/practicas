package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mensajes;

@Repository
public interface MensajesRepository extends JpaRepository<Mensajes, Long> {

}
