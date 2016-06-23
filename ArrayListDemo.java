import java.util.ArrayList;


public class ArrayListDemo {

	
	public static void main(String[] args) {
		EMP e1=new EMP(1,"Ankita",10000);
		EMP e2=new EMP(2,"Prashant",9900000);
		ArrayList<EMP> arr=new ArrayList<EMP>();
		arr.add(e1);
		arr.add(e2);
		for(Object ob:arr)
		{
			EMP e=(EMP)ob;
			System.out.println(e);
		}
			
		
	}

}
