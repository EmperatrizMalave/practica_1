package com.drbanner.app.entity;

import java.io.Serializable;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="paquetes")
public class Paquete implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(length = 150, nullable = false)
	private String nombre;

	private double costo;

	@Column(length = 3000)
	private String descripcion;

	@OneToMany(mappedBy="paquete", fetch = FetchType.LAZY)
	@JoinColumn(name = "paquetes_id", referencedColumnName = "id")
    List<Servicio> servicios;

	@ManyToMany
	@JoinTable(
		name = "paquetes_images", 
		joinColumns = @JoinColumn(name = "paquetes_id"), 
		inverseJoinColumns = @JoinColumn(name = "imagenes_id"))
    Set<Imagen> imagenes;
	
}
