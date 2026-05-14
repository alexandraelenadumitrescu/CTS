package strategy_client.implementare;

public class Client {
    private IVizualizare vizualizare;

    public Client() {

    }

    public void setVizualizare(IVizualizare vizualizare) {
        this.vizualizare = vizualizare;
    }

    public void utilizeaza(){
        if(vizualizare!=null){
            System.out.println(" se vizualizeaza ....");
            vizualizare.vizualizeaza();
        }else{
            System.out.println("nu a fost setat tipul de vizualizare");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "vizualizare=" + vizualizare +
                '}';
    }
}
