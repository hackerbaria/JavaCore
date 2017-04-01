/*
 * Copyright 2016 PCN VietNam Programming Center to Present
 * Original designer : Thong
 * Create Date¡GApr 1, 2017
 * -------------------------------------------------------------------------------------
 * Modify Date ¡@¡@¡@Modify By¡@¡@¡@¡@Modify Reason¡@
 * -------------------------------------------------------------------------------------
 *  		 		 	    
 */
package com.thong.hashcode;

public class Employee {
	
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int age) {
		super();
		this.age = age;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public int hashCode() {
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Employee emp = (Employee)obj;
		if (emp.age == age) {
			flag = true;
		}
		return flag;
		
	}
	
	

}
