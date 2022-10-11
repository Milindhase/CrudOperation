package InterviewQuestion;

import java.util.Scanner;

public class MissingNumberArray {

	public static void main(String[] args) {
		// Que. To Find Out Missing number in the array
		
	//   System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter Your Number");
		num=sc.nextInt();
		
		int arr[]=new int [num];
		int len=arr.length;
		
		 System.out.println("Enter Your Array Element");
		for(int i=0;i<=len-2;i++)
		{
			arr[i]=sc.nextInt();
		}	
		
		int sumarr=0;
		int sum=(num*(num+1)/2);
		for(int i=0;i<=len-2;i++)
		{
			sumarr=sumarr+arr[i];
		}
		
		int missnumber=sum-sumarr;
		
		 System.out.println("Missing Number  "+missnumber);
	}

}
