package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
   ServerSocket xServerSocket;
   MsgReceive receiver;
   ArrayList<ServerSideClient> list;
   public Server(MsgReceive msgReceiver)
   {
	   receiver = msgReceiver;
	   list = new ArrayList<ServerSideClient>();
	   try
	   {
		xServerSocket = new ServerSocket(1234);
		
		Thread t = new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
					try
					{
						Socket socket = xServerSocket.accept();
						ServerSideClient ssc = new ServerSideClient(socket,receiver);
						list.add(ssc);
					} catch(IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
		
	   }catch (IOException e)
	   {
		   e.printStackTrace();
	   }
	   
   }
   

public void sendAll(String s)
   {
	   for(ServerSideClient ss : list)
	   {
		   ss.send(s);
	   }
   }
}
