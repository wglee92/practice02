package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		char[] c2 = new char[cs.length];
		for (int i=0; i<str.length(); i++) {
			c2[cs.length-1-i] = cs[i];
			
		}
		return c2;
		/* 코드를 완성합니다 */
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */	
		System.out.println( array );
	}
}
