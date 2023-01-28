package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Automovil;

public interface IAutomovilRepo {

	public void insertar(Automovil automovil);
	public Automovil buscar(Integer id);
	public void eliminar(Integer id);
}
