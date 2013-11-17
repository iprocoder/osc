/**
 * Created with IntelliJ IDEA.
 * User: iprocoder
 * Date: 11/17/13
 * Time: 7:15 AM
 * To change this template use File | Settings | File Templates.
 */
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException
    {
        InputStream in = null;
        BufferedReader bin = null;
        Socket sock = null;

        try {
            // make connection to socket
            sock = new Socket("127.0.0.1", 5155);
            in = sock.getInputStream();
            bin = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = bin.readLine()) != null)
                System.out.println(line);
        }
        catch (IOException ioe){
            System.err.println(ioe);
        }
        finally {
            if (sock != null)
                sock.close();
        }
    }
}