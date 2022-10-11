package InterviewQuestion;

import java.util.Scanner;

public class SumOffArrayElement {

	public static void main(String[] args)
	{
		//System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		
		// Que. To sum of array element
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		int len=arr.length;
		int sum=0;
		
		System.out.println("Enter Your Array Element");
		
		for(int i=0;i<len;i++)
		 {
			arr[i]=sc.nextInt();
		 }
     
		System.out.println("Size Of the Array  "+len); 
	
	
	for(int i=0;i<len;i++)
	{
		sum=sum+arr[i];
	}	
	System.out.println("Total Sum Of Array  == "+sum);

}
}