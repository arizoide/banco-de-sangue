package com.senac.bancodesangue.dao;

import com.senac.bancodesangue.model.Doador;
import org.springframework.data.repository.CrudRepository;

public interface DoadorDAO extends CrudRepository<Doador, Integer> {
}
