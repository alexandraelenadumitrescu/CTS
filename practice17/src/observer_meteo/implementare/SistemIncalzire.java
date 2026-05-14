package observer_meteo.implementare;


public class SistemIncalzire implements IObserver
{
    private int prag;
    private boolean estePornita=false;

    public void setPrag(int prag) {
        this.prag = prag;
    }

    public boolean isEstePornita() {
        return estePornita;
    }

    @Override
    public void update(int temperatura) {
        if(temperatura<prag&&!estePornita){
            System.out.println("a pornit caldura");
        }else{
            System.out.println("s a inchis caldura");
        }

    }
}
