import java.util.Arrays;

/* Program based on Convert Array into String*/
public class ArrayToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		for(int i:arr)
		{
			System.out.println(i);
		}
		String s=Arrays.toString(arr);
		System.out.println(s);

	}

}
