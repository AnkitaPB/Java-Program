import java.util.*;
public class ReveseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=in.nextInt();
		int revNumber=0;
		while(number!=0)
		{
		      int temp=number%10;
		      number=number/10;
		      revNumber=(revNumber*10)+temp;
		}
		System.out.println("Reverse number is: "+revNumber);
	}

}
