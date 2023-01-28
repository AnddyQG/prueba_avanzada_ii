package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Renta;

public interface IRentaRepo {
public void insertar(Renta renta);
public Renta buscar(Integer id);
public void eliminar(Integer id);

}
