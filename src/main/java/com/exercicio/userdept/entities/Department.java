package com.exercicio.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long department_id;
	private String name;
	
	public Department() {
		
	}

	

	public Long getDepartment_id() {
		return department_id;
	}



	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	
	
	

}
