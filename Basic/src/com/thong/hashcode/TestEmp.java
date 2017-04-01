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

public class TestEmp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(23);
		Employee emp2 = new Employee(23);
		System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));

	}

}
