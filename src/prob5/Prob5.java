package prob5;

import java.util.*;
class Game {
	Scanner sc = new Scanner(System.in); 

	public void game() {
		int min = 1;
		int max = 100;
		int count = 0;
		Random r = new Random();
		int correctNumber = r.nextInt( 100 ) + 1;
		
		System.out.println( "수를 결정하였습니다. 맞추어 보세요" );
		System.out.println(min + "-" + max);
		for (int i=0; i<1000; i++) {
			System.out.print(++count + ">>");
			int num = sc.nextInt();
			if (num < correctNumber) {
				System.out.println("더 높게");
				if(num>min)
				min = num;
				System.out.println(min + "-" + max);
			}
			else if (num > correctNumber) {
				System.out.println("더 낮게");
				if(num<max)
				max = num;
				System.out.println(min + "-" + max);
			}
			else if (num == correctNumber) {
				System.out.println("맞았습니다.");
				System.out.print("다시하겠습니까(y/n)>>");
				String answer = sc.next();
				if (answer.equals("y"))
					game();
				else if (answer.equals("n"))
					break;
			}
		}
	}
}
public class Prob5 {

	public static void main(String[] args) {
		Game g = new Game();
		g.game();
	}
}