package ArrayAssignment;

public class ClassDemo {

	public static void main(String[] args) {
		
		Demo demoObj = new Demo();
		demoObj.method1();

	}

}

class Demo{
	
	public void method1() {
		System.out.println("Calling method1 from main using object of Demo class");
	}
	
}
