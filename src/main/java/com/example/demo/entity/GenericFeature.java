package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class GenericFeature {
	
	@Id
	String id;
	String name;
	LocalDate date;

}
