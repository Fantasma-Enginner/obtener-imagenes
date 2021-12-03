package com.obtener.imagenes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.obtener.imagenes.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{


}
