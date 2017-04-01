/*
 * Copyright 2016 PCN VietNam Programming Center to Present
 * Original designer : Thong
 * Create Date�GApr 1, 2017
 * -------------------------------------------------------------------------------------
 * Modify Date �@�@�@Modify By�@�@�@�@Modify Reason�@
 * -------------------------------------------------------------------------------------
 *  		 		 	    
 */
package com.thong.hashcode;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(23);
		Employee emp2 = new Employee(24);
		Employee emp3 = new Employee(25);
		Employee emp4 = new Employee(26);
		Employee emp5 = new Employee(27);
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
		System.out.println("HashSet Size--->>> " + hs.size());
		System.out.println("hs.contains( new Emp(25))--->>> " + hs.contains(new Employee(25)));
		System.out.println("hs.remove( new Emp(24)--->>> " + hs.remove( new Employee(24)));
		System.out.println("Now HashSet Size--->>> " + hs.size());

	}

}
