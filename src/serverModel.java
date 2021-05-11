import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
// början MVC
public class serverModel {

    public void runServer () throws IOException {
        int port = 1234;
        boolean run = true;
        ServerSocket serverSocket;
        Socket socket;

        System.out.println("Server started.");
        serverSocket = new ServerSocket(port);
    }


}