package s1.drone_connection_singleton.implementare;

public interface IDroneConnection {

    void connectUser(String userId);
    void disconnectUser(String userId);
    boolean isUserConnected(String userId);
    String getDedicatedChannel(String userId);
}