import com.sun.corba.se.pept.transport.ListenerThread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port;
    private boolean run;
    private PrintWriter out = null;
    private ServerSocket serverSocket;
    private Socket socket;

    public void connect(Controller Controller) {
        int port = 1234;
        boolean run = true;
        System.out.println("Server started.");

        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Waiting for connections!");

        try {
            socket = serverSocket.accept();
            System.out.println("Client connected!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // något
    }

    public void listener(Controller Controller){
        ListenerThread in = null;
//        try {
//            in = new ListenerThread(new BufferedReader(new InputStreamReader(socket.getInputStream())), Controller);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Thread listener2 = new Thread(in);
//        listener2.start();
//        System.out.println("Client failed to communicate");
    }


    public void chat(String msg) {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Server:" + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public void close() throws IOException {
            out.close();
            socket.close();
            System.out.println("Closing down");
        }
    }