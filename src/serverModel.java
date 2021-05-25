public class serverModel {
    private Server server;

    public serverModel(Server server) {
        this.server = server;
        this.server.connect(controller);
    }

    public void sendMessage(String msg){
        this.server.chat(msg);
    }
}