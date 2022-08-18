package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Imagen;

import com.drbanner.app.repository.IImagenRepository;

public class ImagenServiceImp implements IImagenService{

	@Autowired
	IImagenRepository imagenesRepository;
	
	@Override
	public List<Imagen> findAllImagenes() {
		return (List<Imagen>) imagenesRepository.findAll();
	}

	@Override
	public Imagen saveImagen(Imagen imagen) {
		return imagenesRepository.save(imagen);
	}

	@Override
	public Imagen deleteImagen(Long id) {
		Imagen imagen= findImagenById(id);
		imagenesRepository.deleteById(id);
		return imagen;
	}

	@Override
	public Imagen findImagenById(Long id) {
		return imagenesRepository.findById(id).orElse(null);
	}
	
}
