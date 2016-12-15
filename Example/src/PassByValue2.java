
public class PassByValue2 {
	Integer id1=100;	
	public static void main(String[] args) {
		int id=10;	
	PassByValue2	n=new PassByValue2();
		n.print(id,n);
		System.out.println(""+id +"=="+n.id1);
		getSomeNumber();
	}
	
	
	public void print(int id,PassByValue2 n){
		id=20;
		n.id1=200;
		
	}
	
	public Integer print(int id){
		id=20;
		return id; 
		
	}
	
	/**
	 *  if finally returns value exception got override
	 * @return
	 */
	
	public static int getSomeNumber( ){
		  try{
		     throw new RuntimeException();
		  } finally {
		     return 12;
		  }
		 }
}
