import javax.swing.*;

public class Controller {
    private View view;
    private clientModel clientModel;
    private serverModel serverModel;
    private String previousMessage;

    public Controller() {
        view = new View();
        JFrame frame = new JFrame();
        frame.setContentPane(view.getPanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Controller c = new Controller();
    }
}
