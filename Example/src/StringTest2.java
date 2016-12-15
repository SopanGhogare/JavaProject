public class StringTest2 {
    public static void main(String[] args) throws Exception
    {
    	
    	String str1= new String("Hello");
    	String str2= new String("Hello");
    	String str3= "Hello";
    	
    	System.out.println(str1.equals(str2));
    	System.out.println(str1==str2);
    	System.out.println(str1.intern()==str2);
    	System.out.println(str1.intern()==str2.intern());
    	
    	System.out.println(str1.intern()==str3.intern());
    	System.out.println(str1.intern()==str3);
    	System.out.println(str1==str3);
    	
    	System.out.println(str1.equals(str3));
    	
    	
    }
    
    
}
 
