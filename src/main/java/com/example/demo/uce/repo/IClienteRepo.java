package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cliente);
	public Cliente buscar(Integer id);
	public void eliminar(Integer id);
	
}
