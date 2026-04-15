package s1.drone_connection_singleton.main;

import s1.drone_connection_singleton.implementare.DroneConnection;

public class Main
{
    public static void main(String[] args) {
        DroneConnection droneConnection=DroneConnection.getInstance();
        droneConnection.connectUser("1");
        droneConnection.getConnections();
        DroneConnection droneConnection2=DroneConnection.getInstance();
        droneConnection2.connectUser("2");
        droneConnection2.getConnections();
    }
}
