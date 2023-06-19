package ArrayAssignment;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calc cal = new Calc();
		int res = cal.add(2, 7);
		System.out.println("Adding 2 integers :"+res);
		
		int res1 = cal.add(2, 7, 1);
		System.out.println("Adding 3 integers :"+res1);
		
		float res2 = cal.add(2.0f, 7.0f);
		System.out.println("Adding 2 decimals :"+res2);
		
	}

}

class Calc{
	public int add(int a, int b) {
		int result = a+ b;
		return result;
	}
	
	public int add(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}
	
	public float add(float a, float b) {
		float result = a+b;
		return result;
	}

}
