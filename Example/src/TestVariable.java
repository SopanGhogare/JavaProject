
public class TestVariable {
	
	int a=100;
	int b=100;
	
	static int c=100;
	static int d=100;
	
	void m1(){
		
		System.out.println("="+a);
		System.out.println("="+b);
		System.out.println("="+c);
		System.out.println("="+d);
	}
	
 static void  m2(){
		
	 TestVariable t1= new TestVariable();
		System.out.println("="+t1.a);
		System.out.println("="+t1.b);
		System.out.println("="+c);
		System.out.println("="+d);
	}
 
 public static void main(String[] args) {
	TestVariable t= new TestVariable();
	t.m1();
	m2();
}

}
