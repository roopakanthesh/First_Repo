package demo.paractise.strings;

public class WithoutUsingLengthMethodORinbuildmethod {
         public static void main(String[] args) {
			String s ="program";
			int i=0;
			int count=0;
			
			try {
				
			while(true) {
				System.out.println(s.charAt(i));
				count++;
				i++;
			}
			}
			catch(Exception e) {
				System.out.println("The length is="+count);
			}         }
		}

