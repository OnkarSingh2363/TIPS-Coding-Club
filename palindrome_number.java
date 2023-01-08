package coding_club_assignment_tips;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rev=0;
		int p=0;
		int count=0;
		int c=n;
		int x=n;
		while(c!=0)
		{
			int rem=c%10;
			count++;
			c=c/10;
		}
		while(x>0) {
			int rem=x%10;
			rev+=rem*Math.pow(10,count-1);
			count--;
			x/=10;
		}
		System.out.println(rev);
		if(n==rev) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}

}

//for revere we can easily use one more formula

//rev=rev*10+rem;
