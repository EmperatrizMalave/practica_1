package com.drbanner.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="imagenes")
public class Imagen implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id	//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(length = 2000, nullable = false)
	private String url;//Otros campos

	private String descripcion;

	@ManyToMany(mappedBy = "imagenes")
    Set<Paquete> imagenPaquetes;
}
