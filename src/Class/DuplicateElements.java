package Class;

public class DuplicateElements {
	
	public static void printDuplicate(int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='\0')
				continue;

			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]='\0';
					break;
				}
				  
			}
		}
		
		System.out.println("Number of duplicate elements are:"+count);
	}

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,4,7,9,8,0,7};
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
			
		System.out.println();
		printDuplicate(arr);
		
      
	}

}
