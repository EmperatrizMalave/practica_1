package com.drbanner.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="caracteristicas")
public class Caracteristica implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(length = 500, nullable = false)
	private String descripcion;

	@ManyToMany(mappedBy = "servicioCaracteristicas")
    Set<Servicio> caracteristicaServicio;
}
