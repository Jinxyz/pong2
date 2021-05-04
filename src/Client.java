import javax.swing.*;
import java.net.Socket;

import static java.lang.System.out;

public class Client {
    Socket socket = null;

    public Client() {
        String ip = (String) JOptionPane.showInputDialog(null, "IP?", "Connect to..", JOptionPane.QUESTION_MESSAGE);
        int port = Integer.parseInt(JOptionPane.showInputDialog(null, "Port?", "Connect to..", JOptionPane.QUESTION_MESSAGE));

        // try socket, if socket false close program
        try {
            socket = new Socket(ip, port);
        } catch (Exception e) {
            System.out.println("Client failed to connect");
            System.exit(0);
        }
    }

    public void close() throws Exception{
        out.close();
        socket.close();
        System.out.println("Done!");
    }
}
