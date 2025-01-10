package com.projeto.api.repositoty;

import com.projeto.api.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository extends CrudRepository<Client, Integer> {

	List<Client> findAll();

}
