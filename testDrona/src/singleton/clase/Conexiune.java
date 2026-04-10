package singleton.clase;

public class Conexiune implements IDroneConnection{
    private String userName="None";
    private boolean isConnected=false;

    public static Conexiune instance;

    private Conexiune() {
    }

    public static Conexiune getInstance(){
        if(instance==null){
            instance=new Conexiune();
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public Conexiune setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public void connect(String userName) {
        if(this.isConnected==true){
            System.out.println("the connection is already established");
        }
        this.isConnected=true;
    }

    @Override
    public void disconnect(String userName) {
        if(this.isConnected==false){
            System.out.println("already disconnected");
        }
        this.isConnected=false;
    }

    @Override
    public boolean isConnected(String userName) {
        if(this.userName.equals(userName)){
            return this.isConnected;
        }
        return false;
    }

    @Override
    public void viewConnections() {

    }

    @Override
    public String toString() {
        return "Conexiune{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
