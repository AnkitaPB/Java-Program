import java.util.Scanner;


public class PalindromeIntger {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0;
		System.out.println("Enter the Number: ");
		java.util.Scanner in=new Scanner(System.in);
		i=in.nextInt();
		int old=i;
		while(i!=0)
		{
			int remainder=i%10;
			j=j*10+remainder;
			i=i/10;
			
		}
		System.out.println(j);
		if(old==j)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		

	}

}
