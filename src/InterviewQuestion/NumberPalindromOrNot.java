package InterviewQuestion;

import java.util.Scanner;

public class NumberPalindromOrNot {

	public static void main(String[] args) {
		// Que. To Check Number IS Palindrom Or Not
		
		//   System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		int sum=0,rev=0;
		System.out.println("Enter Your Number");
		n=sc.nextInt();
		
		int temp=n;
		System.out.print("Reverse Number  ==  ");
		while(n>0)
		{
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
			System.out.print(rev); 
		}	
		System.out.println("  ");
		
		
		if(temp==sum)
		
			System.out.println("Number Is Palindrom");
		
		else
			System.out.println("Number is not palindrom");
	

	}

}