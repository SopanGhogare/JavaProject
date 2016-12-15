public class StringTest3 {
    public static void main(String[] args) throws Exception
    {
    	
    	String str1= new String("Hello");
    	String str2= new String("Hello");
    	String str3= "Hello";
    	
    	
    	System.out.println(str1.intern()==str2.intern());
    	System.out.println(str2.intern()==str3.intern());
    	System.out.println(str3.intern()==str1.intern());
    	
    	System.out.println(str1==str2);
    	System.out.println(str2==str3);
    	System.out.println(str3==str1);
    	
    	
    	System.out.println(str1.hashCode());
    	System.out.println(str2.hashCode());
    	System.out.println(str3.hashCode());
    	
    	System.out.println(str1.intern().hashCode());
    	System.out.println(str2.intern().hashCode());
    	System.out.println(str3.intern().hashCode());
    	
    	System.out.println(str1.equals(str2));
    	System.out.println(str2.equals(str3));
    	System.out.println(str3.equals(str1));
    	
    	System.out.println(str1.intern().equals(str2));
    	System.out.println(str2.intern().equals(str3));
    	System.out.println(str3.intern().equals(str1));

    	str3="";
    	System.out.println(str3.hashCode());
    	
    }
    
    
}
 
