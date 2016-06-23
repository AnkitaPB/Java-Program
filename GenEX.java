class Demo<T>
{
	public void swap( T a, T b)
	{
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("The value of a & b="+a+" "+b);
	}
}
public class GenEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=50;
		Demo d=new Demo();
		d.swap(a,b);
		//System.out.println("Intger Swapping: a="+a+"b="+b);
		double d1=20.0,d2=50.0;
		d.swap(d1,d2);
		//System.out.println("Double Swaping: d1= "+d1+"d2="+d2);
		String s1="abc",s2="xyz";
		d.swap(s1, s2);
		//System.out.println("String Swaping: s1= "+s1+"s2="+s2);

	}

}
