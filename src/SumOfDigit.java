import java.util.Scanner;


public class SumOfDigit {

	
	public static void main(String[] args) {
		int i,sum=0;
		Scanner din=new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		i=din.nextInt();
        System.out.println("Number: "+i);
        //String s= i+" ";
        //int len=s.length()-1;
        while(i!=0)
        {
        int temp=i%10;
        i=i/10;
        System.out.println("temp"+temp);
        sum+=temp;
        //len--;
        }
        System.out.println("sum of digit:" +sum);
        
	}

}
