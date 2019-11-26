package com.eventoapp.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eventoapp.demo.model.Convidado;

@Service
public interface ConvidadoService {
	
	Convidado findByRg(String rg);
		
	Convidado save(Convidado convidado);
	
	void delete(Convidado convidado);
	
	List<Convidado> findAll(Convidado convidado);
}
