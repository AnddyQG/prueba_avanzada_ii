package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.repo.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{
@Autowired
private IAutomovilRepo automovilRepo;
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.automovilRepo.eliminar(id);
	}

}
