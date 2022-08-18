package com.drbanner.app.entity;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="servicios")
public class Servicio implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	// @JoinColumn(name = "paquetes_id", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
    private Paquete paquete;
	
	@Column(length = 150, nullable = false)
	private String nombre;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Caracteristica caracteristicas;
}
