package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BuildingLine extends GenericFeature {
	
	String someAttribute;

}