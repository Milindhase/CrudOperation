package InterviewQuestion;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args)
	{
		// Que.  Search array Element
		//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int count=0;
		int len=arr.length;
		int num;
		
		System.out.println("Enter Your Array Element ");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		} 	
		
		System.out.println("Length Of Array === "+len);
			
		System.out.println("Enter Your  Number Search");
		num=sc.nextInt();
		for(int i=0;i<len;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}	
		}
		
		if(count==1)
		{
			System.out.println("Number Is Found "); 
		}
		
		else
		{
			System.out.println("Number Is Not found"); 
		}
	}
}
