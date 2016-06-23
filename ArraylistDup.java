import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArraylistDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> ar=new ArrayList<Integer>();
		ar.add(new Integer(4));
		ar.add(new Integer(5));
		ar.add(new Integer(4));
		ar.add(new Integer(6));
		System.out.println(ar);
		List<Integer> ar1=new ArrayList<Integer>();
		ar1=Collections.synchronizedList(ar);
		
		Set<Integer> s=new HashSet<Integer>(ar);
		ar.clear();
		System.out.println(s);
		System.out.println(s.contains(4));
		
		
	}

}
