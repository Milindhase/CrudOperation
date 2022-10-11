package InterviewQuestion;

public class DublicateElementArray {

	public static void main(String[] args) {
		// Que. To Find Out Duplicate Element Array
		
		//   System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %
		
		int arr[]={10,20,10,30,40,20,60,30,80,60}; 
		int len=arr.length;
		int dup[]=new int[7];
		int len1=dup.length;
		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<=len-1;j++)
			{
				if(arr[i]==arr[j])
				{
					dup[i]=arr[i];
				}
				
			}
				
		}
		
		System.out.println("Display Duplicate Element of Array");
		for(int i=0;i<=len1-1;i++)
		 {
			 System.out.println(dup[i]);
		 }
		
		
	}

}
