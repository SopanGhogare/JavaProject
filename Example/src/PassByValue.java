
public class PassByValue {
Integer id=10;
	public static void main(String[] args) {
		
		PassByValue p= new PassByValue();
		
		//p.print(p);
		//System.out.println("main=="+p.id);
		
		
		String s1 = "abcd5";
		String s2 = "abcd"+"5";
		String s3 = "adcd"+s1.length();
		System.out.println(s1 == s2);//true
		System.out.println(s2 == s3);//false
		System.out.println(s2 == s3);//false
	}
	
	
	public void print(PassByValue c){
		
		System.out.println(""+c.id);
		c.id=15;
		c=null;
	}
}
