package singleton.clase;

public interface IDroneConnection {
    void connect(String userName);
    void disconnect(String userName);
    boolean isConnected(String userName);
    void viewConnections();
}
