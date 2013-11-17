/**
 * Created with IntelliJ IDEA.
 * User: iprocoder
 * Date: 11/17/13
 * Time: 7:15 AM
 * To change this template use File | Settings | File Templates.
 */
import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String[] args)  {
        try {
            ServerSocket sock = new ServerSocket(5155);

            // now listen for connections
            while (true) {
                Socket client = sock.accept();
                // we have a connection

                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
                // write the Date to the socket
                pout.println(new java.util.Date().toString());

                // close the socket and resume listening for more connections
                client.close();
            }
        }
        catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
