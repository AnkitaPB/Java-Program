import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class FindDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			arr.add(i);
		}
		arr.add(9);
		arr.add(2);
		arr.add(3);
		System.out.println("ArraList: ");
		for(Integer i:arr)
		{
			System.out.print(i+" " );
			
		}
		System.out.println();
		Set<Integer> s=new HashSet<Integer>();
		for(int i : arr){

			if(!s.add(i)){

				System.out.println("Duplicate element: "+i);

			}
		}
		//s.addAll(arr);
		System.out.println("remove Duplicates");
	    System.out.println(s+" ");		
	}

}
