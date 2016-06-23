import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Persist {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Aarya");
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		out.close();
		System.out.println("Success");
			// TODO Auto-generated catch block
		
		
		
		

	}

}
