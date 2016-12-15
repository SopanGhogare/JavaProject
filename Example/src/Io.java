public class Io {

public static void main(String ... numberArray){
	Integer numberArray1[]={9,10,32,89,66,787,31};
	
        for(Integer i:numberArray1){
        	boolean isprime=true;
            for(Integer j=2;j<i;j++){
                 if(i%j==0){
                isprime=false;
                break;
                }
            }
            if(isprime)
            	System.out.print(i);
        }
    }
 
}
