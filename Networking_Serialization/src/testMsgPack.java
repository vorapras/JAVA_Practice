
public class testMsgPack 
{
   public static void main(String[] args)
   {
	   Person2 james = new Person2();
		james.id = 1;
		james.name = "James";
		james.surname = "sea-ngow";
		james.phone = "0853507540";
		
		MessagePack msgpack = new MessagePack();
		//Serialize
		byte[] bytes = msgpack.write(james);
		System.out.println(bytes.length);
		//Deserailize
		//MyMessage st = msgpack.read(bytes, MyMessage.class);
		
	   
   }
}
