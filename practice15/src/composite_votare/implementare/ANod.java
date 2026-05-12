package composite_votare.implementare;

public abstract class ANod {
//    ANod abstract cu metodele de bază (getDenumire, valoarea agregată) + adaugaNod,
////        eliminaNod, getNod care aruncă UnsupportedOperationException by default
///
    private String denumire;

    public String getDenumire(){
        return this.denumire;
    }
    //add
    public void addChild(ANod nod){
        throw new UnsupportedOperationException();
    }
    //remove
    public void remove(ANod nod){
        throw new UnsupportedOperationException();
    }
    //getChild
    public ANod getChild(int index){
        throw new UnsupportedOperationException();
    }
    public abstract boolean esteAprobat();


}
