
public class MainClass {

	public static void main(String[] args) {

		MainClass t = new MainClass();
		t.test(null);
	}

	public void test(Object a) {
		System.out.println("O");
	}

	public void test(String a) {
		System.out.println("S");
	}

}
