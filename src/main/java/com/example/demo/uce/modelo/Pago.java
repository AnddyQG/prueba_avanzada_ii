package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "pago")
public class Pago {

	
	/*
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pago_seq")
	@SequenceGenerator(name = "pago_seq",sequenceName = "pago_seq",allocationSize = 1)
	*/
	@Id
	@Column(name = "pago_id")
	private Integer id;
	@Column(name = "pago_numeroTarjeta")
	private String numeroTarjeta;
	@Column(name = "pago_valor")
	private BigDecimal valor;
	@OneToOne
	@JoinColumn(name = "pago_id_rent")
	private Renta renta;
	
	
	//getters y setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Renta getRenta() {
		return renta;
	}
	public void setRenta(Renta renta) {
		this.renta = renta;
	}
	
	
	
}
