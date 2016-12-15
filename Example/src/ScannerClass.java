import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		Integer num = scan.nextInt();
		
		System.out.println("Entered Number ="+num);

		scan.close();
	}

}
