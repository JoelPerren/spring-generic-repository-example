package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.GenericFeature;

@Repository
public interface GenericFeatureRepository extends SaveOnlyRepository<GenericFeature, String>, QueryByClassRepository {

}
