package com.eventoapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventoapp.demo.model.Convidado;
import com.eventoapp.demo.model.Evento;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, String>{
		
	Iterable<Convidado> findByEvento(Evento evento);
	
}
