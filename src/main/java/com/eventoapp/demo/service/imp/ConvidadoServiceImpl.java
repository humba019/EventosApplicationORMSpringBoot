package com.eventoapp.demo.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventoapp.demo.model.Convidado;
import com.eventoapp.demo.repository.ConvidadoRepository;
import com.eventoapp.demo.service.ConvidadoService;

@Service
public class ConvidadoServiceImpl implements ConvidadoService{

	@Autowired
	ConvidadoRepository cr;
	
	@Override
	public Convidado findByRg(String rg) {
		Optional<Convidado> c = cr.findById(rg);
		return c.get();
	}

	@Override
	public Convidado save(Convidado convidado) {
		return cr.save(convidado);
	}

	@Override
	public void delete(Convidado convidado) {
		cr.delete(convidado);
	}

	@Override
	public List<Convidado> findAll(Convidado convidado) {
		return cr.findAll();
	}


	

}
