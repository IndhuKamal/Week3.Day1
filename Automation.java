package week3.Day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.ruby();
		auto.Python();
	}

	public void selenium() {
		System.out.println("Learn Selenium");
	}

	public void java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
	System.out.println("Learn Ruby");
		
	}

}
