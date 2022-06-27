package org.department;

import org.college.college;

public class Department extends college {
	public void deptName() {
		System.out.println("IT");
	}
	public static void main(String[] args) {
		Department dept=new Department();
		dept.CollegeCode();
		dept.deptName();
	}

}
