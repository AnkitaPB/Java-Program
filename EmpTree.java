import java.util.Comparator;
import java.util.TreeSet;


public class EmpTree {
	public static void main(String args[])
	{
	       EMP e1=new EMP(1,"ABC",234);
	       EMP e2=new EMP(3,"MNO",678);
	       EMP e3=new EMP(4,"KLM",245);
	       EMP e4=new EMP(23,"GHJ",3567);
	       Comparator c=new BasicComparator();
	       TreeSet tr=new TreeSet(c);
	       tr.add(e1);
	       tr.add(e2);
	       tr.add(e3);
	       tr.add(e4);
	       for(Object ob : tr)
	       {
	    	   EMP e=(EMP)ob;
	    	   System.out.println("EMPLOYEE :"+e);
	       }
	}

}
