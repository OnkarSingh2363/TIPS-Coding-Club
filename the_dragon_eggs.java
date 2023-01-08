package coding_club_assignment_tips;

import java.util.Scanner;

public class the_dragon_eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int G=in.nextInt();//gold coins per gram
		int S=in.nextInt();//silver coins per gram
		int A=in.nextInt();//grams of gold
		int B=in.nextInt();//grams of silver
		if(G*A>=S*B) {
			System.out.println("Gold");
		}
		else {
			System.out.println("Silver");
		}
	}

}
