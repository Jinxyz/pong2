public class clientModel {
    private Client client;

    public clientModel(Client client) {
        this.client = client;
        //this.client.connect(Controller);
        //this.client.listener(Controller);
    }

    public void sendMessage(String msg) {
        client.chat(msg);
    }
}
