import java.util.ArrayList;
import java.util.Collections;


public class ArrInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(new Integer(23));
		arr.add(new Integer(34));
		arr.add(new Integer(12));
		int sum=0;
		
		for(Object ob:arr)
		{
			sum+=(Integer)ob;
		}
		System.out.println("Sum="+sum);
		   
        Collections.sort(arr);   
        System.out.println("Arraylist in Ascending Order"+arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("Arraylist in Descending Order"+arr);
	}   
}
