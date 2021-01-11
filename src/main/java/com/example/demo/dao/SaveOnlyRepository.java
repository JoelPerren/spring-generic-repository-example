package com.example.demo.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface SaveOnlyRepository<T, ID> extends Repository<T, ID> {
	
	// Expose only the save methods of a CRUD repository
	
	<S extends T> S save(S entity);

	<S extends T> Iterable<S> saveAll(Iterable<S> entities);

}
