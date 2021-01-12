package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Data
public abstract class GenericFeature implements Persistable<String> {

	@Transient
	private boolean isNew = true;

	@Override
	public boolean isNew() {
		return isNew;
	}

	@PrePersist
	@PostLoad
	void markNotNew() {
		this.isNew = false;
	}
	
	@Id
	String id;
	String name;
	LocalDate date;

}
