import java.util.Arrays;
import java.util.Collections;


public class RevArray {

	public static void main(String a[])
	{
		int iarr[]={1,2,3,4,5,6,7,8,9,0};
		String sarr[]={"a","b","c","d","e","f","g","h","i"};
		System.out.println("Original Array:"+ Arrays.toString(iarr));
	//    System.out.println("Length of array:"+iarr.length);
		Collections.reverse(Arrays.asList(iarr));
	}
}
