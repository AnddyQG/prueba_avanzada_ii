package com.example.demo.uce.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo{
@PersistenceContext
private EntityManager entityManager;
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Automovil.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Automovil automovil=this.buscar(id);
		this.entityManager.remove(automovil);
	}

}
