package week3.Day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student id is " + id);
}
public void getStudentInfo(int id,String Name) {
	System.out.println("Student id and name is " + id  + Name);
}
public void getStudentInfo(String a,long b) {
	System.out.println("Student Mail Id and Phone Number is  " + a  + b);
}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(9807, "Indhu");
		stu.getStudentInfo(9807);
		stu.getStudentInfo("tskindhu@gmail.com", 9877655790l);

	}

}
