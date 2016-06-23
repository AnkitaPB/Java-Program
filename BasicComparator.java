import java.util.Comparator;


public class BasicComparator implements Comparator<Object> {
	 public int compare(Object ob1,Object ob2)
	 {
		 EMP e1=(EMP)ob1;
		 EMP e2=(EMP)ob2;
		 if(e1.eno<=e2.eno)
		 {
			 return -1;
		 }
		 else
		 {
			 return 1;
		 }
	 }
	

}
