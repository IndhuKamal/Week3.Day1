package week3.Day1;


public class AxisBank extends BankInfo{

public void deposit() {
	System.out.println("Override Deposit Acc");
}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.saving();
		axis.fixed();
	}
	
}
