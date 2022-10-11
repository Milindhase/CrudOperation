package InterviewQuestion;

import java.util.Arrays;

public class ArrayElementAscAndDscOrder {

	public static void main(String[] args) {
		// Que. To Find Ascending and descending order Element Array
		
				//   System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		int arr[]={10,80,20,90,60,30,10,5,80,7,33,54,12};
		
		int len=arr.length;
		Arrays.sort(arr);
   
		System.out.println("Array Element are Ascending Order");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}	
		
		System.out.println("Array Element are Descending order");
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}	
		
	}

}
