import javax.swing.*;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

import static java.lang.System.out;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        // connect
        String ip = (String) JOptionPane.showInputDialog(null, "IP?", "Connect to..", JOptionPane.QUESTION_MESSAGE);
        int port = Integer.parseInt(JOptionPane.showInputDialog(null, "Port?", "Connect to..", JOptionPane.QUESTION_MESSAGE));
        out.println("connected :)");

        // try socket, if socket false close program
        try {
            socket = new Socket(ip, port);
        } catch (Exception e) {
            System.out.println("Client failed to connect");
            System.exit(0);
        }
        out.close();
        socket.close();
        System.out.println("Done!");
    }
}

