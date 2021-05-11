import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 1234;
        boolean run = true;
        ServerSocket serverSocket;
        Socket socket;

        System.out.println("Server started.");
        serverSocket = new ServerSocket(port);

        while (true) {
            System.out.println("Waiting for connections!");
            socket = serverSocket.accept();

            // Go
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Client connected!");

            // close server
            in.close();
            out.close();
            socket.close();
            System.out.println("Closing down");
        }
    }
}