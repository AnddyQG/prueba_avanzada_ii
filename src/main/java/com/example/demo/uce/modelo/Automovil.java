package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq",sequenceName = "auto_seq",allocationSize = 1)
	@Id
@Column(name = "auto_id")
	private String placa;
	@Column(name = "auto_valorPorDia")
	private BigDecimal valorPorDia;
	@OneToMany(mappedBy = "automovil",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Renta> renta;
	
	//getters y setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}
	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}
	public List<Renta> getRenta() {
		return renta;
	}
	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}
	
	
	/*Hotel hotel=this.entityManager.find(Hotel.class, id);
	hotel.getHabitaciones().size();
	return hotel;*/
}
