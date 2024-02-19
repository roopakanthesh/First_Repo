package demo.mainmethod.com;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		main();
		
	}
	public static void main() {
		System.out.println("4");
		main(3);
		System.out.println("1");
	}
	public static void main(int a) {
		System.out.println("2");
	}

}
