package com.cg.eis.exception;
import java.util.*;
public class EmployeeExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		try {
		if(salary<3000)
		{
			throw new Excep("Salary is below 3000");
		}
		else
		{
			System.out.println("Success");
		}
	}
	catch(Excep e) {
		System.out.println(e);
	}
	}

}
