import java.util.Scanner;


public class Pyramid {

	
	public static void main(String[] args) {
		int row=0,col=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the row: ");
		row=in.nextInt();
		for(int i=0;i<row;i++)
		{
			//System.out.println(i);
			
			for(int j=0;j<=i;j++)
			{
			//	System.out.println(j);
				System.out.print(i +" ");
				
			}
			System.out.println();
		}
	}

}
