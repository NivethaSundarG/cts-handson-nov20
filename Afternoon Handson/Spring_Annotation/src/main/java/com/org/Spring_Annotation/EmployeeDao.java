package com.org.Spring_Annotation;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	public void store() {
		System.out.println("store() method in DAO layer");
		
	}

}