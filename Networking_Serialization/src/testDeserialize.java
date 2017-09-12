import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class testDeserialize {

	public static void main(String[] args) {
		Person sp;
		FileInputStream fStream ;
		
		try {
			fStream = new FileInputStream(new File("/Users/ZerWinner/Downloads/james.bin"));
			ObjectInputStream objIn = new ObjectInputStream(fStream);
			
			sp = (Person)objIn.readObject();
		
			System.out.println(sp.id);
			System.out.println(sp.name);
			System.out.println(sp.surname);
			System.out.println(sp.phone);
			objIn.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
	    } catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	    }
		
	}

}
