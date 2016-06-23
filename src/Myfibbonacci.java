
public class Myfibbonacci {
	public static void main(String a[])
	{
		int feb=10;
		int a1[]=new int[feb];
		a1[0]=0;
		a1[1]=1;
		
		for(int i=2;i<feb;i++)
		{
			a1[i]=a1[i-1]+a1[i-2];
		}
		System.out.println("Fibbonaci Series: ");
		for(int i=0;i<feb;i++)
		{
			System.out.println(a1[i]);
		}
				
		
		
	}

}
