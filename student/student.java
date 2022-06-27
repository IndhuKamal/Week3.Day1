package org.student;


import org.department.Department;

public class student extends Department {
public void stuName() {
	System.out.println("Indhu");
}
public void stuDept() {
	System.out.println("IT");
}
public void stuID() {
	System.out.println("123456");
}
	public static void main(String[] args) {
		student stu= new student();
		stu.CollegeName();
		stu.deptName();
		stu.stuName();

	}

}
