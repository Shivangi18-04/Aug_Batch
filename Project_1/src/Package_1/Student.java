package Package_1;

public class Student {

	int a;
	
	public void abc()
	{
		System.out.println("Welcome to all of you");
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.abc();
		obj.abc();
		obj.a=113;
		
		System.out.println("value of a "+ obj.a);
		
		obj.a=200;
		System.out.println("value of a " + obj.a);
		
	}
	
}
