package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class HistoricalSite extends GenericFeature {
	
	String someOtherAttribute;

}
