
public class SortArray {

	
	public static void main(String[] args) {
		int arr[]={12,23,45,2,6};
    System.out.println("Array: ");
    for(int i:arr)
    {
    	System.out.println(i+" ");
    }
    System.out.println("Sorted Array; ");
    for(int i=0;i<arr.length-1;i++)
    {
    	for(int j=1;j<arr.length-i;j++)
    	{
    		if(arr[j-1]>arr[j])
    		{
    			int temp=arr[j];
    			arr[j]=arr[j-1];
    			arr[j-1]=temp;
    			
    		}
    	}
    }
    for(int i:arr)
    {
    	System.out.print(i +" ");
    }
    
	}

}
