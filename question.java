package demo.practise;

public class question {
	public static void main(String[] args) {
		String s = "india newzealand";
		String[] split = s.split(" ");
		System.out.println((split[0].charAt(0)+"").toUpperCase()+split[0].substring(1)+ 
				" "+(split[1].charAt(0)+"").toUpperCase()+split[1].substring(1));
	
	
	}

}
