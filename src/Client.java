import com.sun.corba.se.pept.transport.ListenerThread;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

import static java.lang.System.out;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        // connect

        public void connect (Controller Controller){
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
        }

        public void listener(Controller Controller){
            ListenerThread in = null;
            try {
                in = new ListenerThread(new BufferedReader(new InputStreamReader(socket.getInputStream())), Controller);
                Thread listener = new Thread(in);
                listener.start();
            } catch (IOException e) {
                System.out.println("Client failed to communicate");
            }
        }

        public void chat(String msg){
            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                out.println("Client: " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }

        public void close() throws IOException {
            out.close();
            socket.close();
            System.out.println("Done!");
        }
    }
}