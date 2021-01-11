package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.example.demo.entity.GenericFeature;

public class QueryByClassRepositoryImpl implements QueryByClassRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public <T extends GenericFeature> Iterable<T> findAllByClass(Class<T> entityClass) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(entityClass);
		Root<T> entityRoot = criteria.from(entityClass);
		criteria.select(entityRoot);

		Iterable<T> results = em.createQuery(criteria).getResultList();
		return results;
	}

	@Override
	public <T extends GenericFeature> T findByClassAndId(Class<T> entityClass, String id) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(entityClass);
		Root<T> entityRoot = criteria.from(entityClass);
		criteria.select(entityRoot).where(builder.equal(entityRoot.get("id"), id));

		return em.createQuery(criteria).getSingleResult();
	}

}
