import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) 
	{
		try
		{
		Socket socket = new Socket("127.0.0.1",1234);
		Scanner sc2 = new Scanner(System.in);
		
		//Output
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println(sc2.nextLine());
		pw.flush();//Close Connection
			
		Scanner sc = new Scanner(socket.getInputStream());
		String s = sc.nextLine();
		
		System.out.println("MSG from SERVER : "+s);
		
		socket.close();
		}catch (UnknownHostException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
