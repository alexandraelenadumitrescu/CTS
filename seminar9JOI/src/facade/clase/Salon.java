package facade.clase;

public class Salon {
    private boolean paturiLibere[]=new boolean[50];
    public Salon(){
        this.paturiLibere[1]=true;
        this.paturiLibere[2]=true;
        this.paturiLibere[5]=true;
        this.paturiLibere[6]=true;
        this.paturiLibere[9]=true;
    }

    public int getNrPatLiber(){
        for( int i=0;i<50;i++){
            if(paturiLibere[i]==true){return i;}
        }
        return -1;
    }


    public void setOcuparePat(int index){
        paturiLibere[index]=false;
    }
}
