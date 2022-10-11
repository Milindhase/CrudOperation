package InterviewQuestion;

public class FindEvenAndOddArray {
	 //System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
	
	// Que. To find  Even And Odd Number In  the array
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,15,17,45,125,89,635,874};
		int even=0,odd=0;
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				
				even++;
				System.out.println("Even Number == "+arr[i]);
			}	
			else
			{
				
				odd++;
				System.out.println("Odd Number == "+arr[i]);
			}
		}
		
		System.out.println("Total Even Number in the Array == "+even);
		System.out.println("Total Odd Number In the Array == "+odd);

	}

}
