package com.example.demo.dao;

import com.example.demo.entity.GenericFeature;

public interface QueryByClassRepository {
	
	<T extends GenericFeature> Iterable<T> findAllByClass(Class<T> entityClass);
	
	<T extends GenericFeature> T findByClassAndId(Class<T> entityClass, String id);

}
