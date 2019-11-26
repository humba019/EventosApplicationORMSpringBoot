package com.eventoapp.demo.service;

import java.util.List;
/*
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.stereotype.Service;

import com.eventoapp.demo.model.Evento;

@Service
public interface EventoService {
	
	/* public Evento findByCodigo(long codigo); */
	
	public Evento save(Evento evento);
	
	public void delete(Evento evento);
	
	public List<Evento> findAll();
	
	public Evento findByCodigo(long codigo);
	
	public void alterar(Evento evento, long codigo);
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "UPDATE EVENTO e SET  e.DATA = :data, e.HORARIO = :horario, e.LOCAL = :local, e.NOME = :nome WHERE e.CODIGO = :codigo"
	 * , nativeQuery = true) void alterarEventoByCodigo(@Param("data")String
	 * data,@Param("horario") String horario,@Param("local") String
	 * local,@Param("nome") String nome,@Param("codigo") long codigo);
	 */
	
}
