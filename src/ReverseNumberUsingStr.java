import java.util.Scanner;


public class ReverseNumberUsingStr {
  public static void main(String a[])
  {
	  int i;
	  System.out.println("Enter the number:");
	  Scanner in=new java.util.Scanner(System.in);
	  i=in.nextInt();
	  StringBuffer s=new StringBuffer(Integer.valueOf(i).toString());
	  s.reverse();
	  System.out.println(s);
	  
  }
}
