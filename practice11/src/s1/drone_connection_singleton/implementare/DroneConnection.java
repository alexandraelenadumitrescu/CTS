package s1.drone_connection_singleton.implementare;

import java.util.List;

public class DroneConnection implements IDroneConnection{

    private List<String> connections;

    @Override
    public void connectUser(String userId) {
        if(connections.contains(userId)){
            System.out.println("utilizatorul deja este conectat");
        }else{
            connections.add(userId);
        }
    }

    @Override
    public void disconnectUser(String userId) {
        if(connections.contains(userId)){
            System.out.println("utilizatorul nu este conectat");
        }else{
            connections.remove(userId);
        }
    }

    @Override
    public boolean isUserConnected(String userId) {
        if(connections.contains(userId)) {
            return true;
        }
        return false;
    }

    @Override
    public String getDedicatedChannel(String userId) {
        return "";
    }
}
