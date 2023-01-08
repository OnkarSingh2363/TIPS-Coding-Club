
package coding_club_assignment_tips;

import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=n;
		int arm=0;
		while(a>0) {
			int rem=a%10;
			arm+=(rem*rem*rem);
			a/=10;
		}
		if(n==arm) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
	}

}
