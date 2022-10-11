package InterviewQuestion;

public class LargestNumberArray {

	public static void main(String[] args) {
		// Que. To Find Largest Element Array
		
		//   System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		
		
         int arr[]={10,80,20,90,60,30,10,5,80,7,33,54,12};
		int len=arr.length;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<len-1;i++)
		{
			
				if(arr[i]>max)
				{
					max=arr[i];
				}
				if(arr[i]<min)
				{
					min=arr[i];
				}
		}
	
		System.out.println("Maximum Element of Array  == "+max);
		System.out.println("Minimum Element of Array  == "+min);
			
	}

}
