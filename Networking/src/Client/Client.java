package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import Server.MsgReceive;

public class Client 
{
   Scanner scanner;
   Socket xSocket;
   PrintWriter printwriter;
   MsgReceive xreceive;
   
   public Client(MsgReceive receive, String host, int port)
   {
	   xreceive = receive;
	try 
	{
		xSocket = new Socket(host,port);
		scanner = new Scanner(xSocket.getInputStream());		
		printwriter = new PrintWriter(xSocket.getOutputStream());
	} catch (UnknownHostException e) {
		// TODO: handle exception
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Thread t = new Thread(new Runnable()
			{

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true)
					{
						String s = scanner.nextLine();
						xreceive.getMsg(s);
					}
				}
        });
	  t.start();
   }
   
   public void send(String s)
	{
		printwriter.println(s);
		printwriter.flush();

	}
}
			
  
