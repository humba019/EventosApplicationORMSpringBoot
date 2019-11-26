package com.eventoapp.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eventoapp.demo.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	@Transactional
	@Modifying
	@Query("update Evento e set e.nome = :nome, e.local = :local, e.data = :data, e.horario = :horario where e.codigo = :codigo")
	void alterarEvento(@Param("nome")String nome, @Param("local")String local, @Param("data")String data,@Param("horario") String horario, @Param("codigo") long codigo);
	
}
