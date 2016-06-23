
public class MySingletone {
	static MySingletone myobj;

	static 
	{
		myobj=new MySingletone();
		
	}
	public static MySingletone getInstance()
	{
		return myobj;
		
	}
	public void testMe()
	{
		System.out.println("Hi..It's working");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        MySingletone ms=getInstance();
        MySingletone ms1=getInstance();
        System.out.println(ms.hashCode()+" "+ms1.hashCode());
        ms.testMe();
        /*In java 'static' keyword is used to take action at the time of class loading. There static block is used to create 'MySingleton' Class Object at the class loading time that is one time only object will be created and same object will be accessed by other classes. And the static method created so that it can be call without creating Object of 'MySingleton' Class in Main method or other java Classes where 'MySingleton' Class instance is required.
*/
		}

}
