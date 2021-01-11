package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GenericFeatureRepository;
import com.example.demo.entity.GenericFeature;

@Service
public class DemoService {
	
	@Autowired
	GenericFeatureRepository featureRepository;
	
	public <T extends GenericFeature> GenericFeature save(T entity) {
		return featureRepository.save(entity);
	}
	
	public <T extends GenericFeature> Iterable<T> findAll(Class<T> entityClass) {
		return featureRepository.findAllByClass(entityClass);
	}

}
