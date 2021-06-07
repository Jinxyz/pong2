import javax.swing.*;
import java.awt.*;

public class View {

    private javax.swing.JPanel JPanel;
    private JList chatMessages;
    private JTextField serverMessage;
    private JTextField clientMessage;
    private JButton sendClient;
    private JButton sendServer;

    public Container getPanel() {
        return JPanel;
    }
}