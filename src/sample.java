import java.util.Scanner;


public class sample {
	public static void main(String a[])
	{
		int temp1=0,i,temp2=0;
		int large=0,count=0;
		int[] larr=new int[12];
  
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number:");
			int no=in.nextInt();
			if(no==0) 
			{
				 for(int j=0;j<larr.length-1;j++)
				  {
					 for(i=1;i<large;i++)
					 {
						 if(larr[i-1]>larr[i])
						 {
							 int temp=larr[i];
							 larr[i]=larr[i-1];
							 larr[i-1]=temp;
		    			
						 }
					 }
				  }
				 System.out.println("Array:");
				 for(i=0;i<large;i++)
				 {
					 System.out.println(larr[i]+" ");
					 count++;
				 }
				System.out.println("**largest number: "+larr[count-1]);
				System.out.println("**Smallest number: "+larr[0]);
				System.out.println("Exit..");
				break;
			}
			larr[large]=no;
			large++;
			continue;
			
		}
	}
}
