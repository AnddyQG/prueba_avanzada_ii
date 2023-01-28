package com.example.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.service.IAutomovilService;
import com.example.demo.uce.service.IClienteService;
import com.example.demo.uce.service.IRentaService;



@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
 private IClienteService clienteService;
	@Autowired
	private IAutomovilService automovilService;
	
	@Autowired
	private IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		/*
		
	*/
	
	Renta renta=new Renta();
	renta.setFecha(LocalDateTime.now());

	renta.setNumeroDias(new BigDecimal(10));
	
this.iRentaService.agregar(renta);
	

Automovil automovil= new Automovil();
automovil.setPlaca("JLP0707");
automovil.setValorPorDia(new BigDecimal(10));

this.automovilService.agregar(automovil);


Cliente cliente= new Cliente();
cliente.setNombre("Anddy");
cliente.setCedula("1721483814");
this.clienteService.agregar(cliente);
	
	
	//Automovil automovilb=this.automovilService.buscar(1);

	
	
	
	}

}
