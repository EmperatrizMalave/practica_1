package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Paquete;
import com.drbanner.app.repository.IPaqueteRepository;
@Service
public class PaqueteServiceImp implements IPaqueteService {

	@Autowired
	IPaqueteRepository paquetesRepository;
	
	@Override
	public List<Paquete> findAll() {
		return (List<Paquete>) paquetesRepository.findAll();
	}

	@Override
	public Paquete save(Paquete paquetes) {
		return paquetesRepository.save(paquetes);
	}

	@Override
	public Paquete deleteById(Long id) {
		Paquete paquete = findById(id);
		paquetesRepository.deleteById(id);
		return paquete;	
	}

	@Override
	public Paquete findById(Long id) {
		return paquetesRepository.findById(id).orElse(null);
	}

}
