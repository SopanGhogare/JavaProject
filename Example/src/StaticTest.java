import java.util.TreeSet;

public class StaticTest {

public static void main(String a[]){
	System.out.println(test());
}
static int test(){
	try{
		//System.exit(0);
		//int b= 23/0;
		//System.out.println(b);
		return 0;
	}
	catch(Exception e){
		System.out.println("PPPPPP");
	}
	finally{
		return 5;
		//System.out.println("finally");
	}
	//System.out.println("ppppppp");

//return 1;

}	
}

