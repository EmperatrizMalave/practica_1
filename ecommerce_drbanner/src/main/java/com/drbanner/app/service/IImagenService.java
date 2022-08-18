package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Imagen;

public interface IImagenService {
	/**
	 * Enlista todos los Imagens de la base de datos
	 * @param Imagen 
	 * @return Listado de Imagens
	 */
	public List<Imagen> findAllImagenes();
	/**
	 * Nos guarda el Imagen en la base de datos
	 * @param Imagen Datos del Imagen
	 * @return Devuelve el Imagen con el Id asignado
	 */ 
	public Imagen saveImagen(Imagen imagen); 
	
	/**
	 * Elimina un Imagen de la base de datos
	 * @param Id identificador del Imagen a eliminar
	 */
	public Imagen deleteImagen(Long id);
	
	/**
	 * Encontrar un Imagen en la base de datos
	 * @param Id identificador del Imagen a buscar
	 * @return
	 */
	public Imagen findImagenById(Long id);
}
