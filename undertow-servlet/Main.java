public class Main
{
 public static void main(String[] args) throws IOException
    {
	byte[] salt = new byte[] { 50, 111, 8, 53, 86, 35, -19, -47 };

	ServerSocket server = new ServerSocket(1500);
	System.out.println("Server 05:");

	Socket client = server.accept();
	SuperSocket c = new SuperSocket(client);

	Scanner userInput = new Scanner(System.in);

	while (true)
	{
	    c.write("hello from server");
	    System.out.println(c.read());
	}
    }
}
