package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] change = new int[MONEYS.length];
		System.out.print("금액 : ");
		int money = sc.nextInt();
		System.out.println();
		for(int i=0; i<MONEYS.length; i++) {
			change[i] = money/MONEYS[i];
			money -= change[i]*MONEYS[i];
		}
		
		for(int i=0; i<MONEYS.length; i++) {
			System.out.println(MONEYS[i] + "원 : " + change[i]);
		}
		
	 }
}