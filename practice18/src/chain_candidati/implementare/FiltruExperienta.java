package chain_candidati.implementare;

public class FiltruExperienta extends AbstractFiltruCandidat{


    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.getExperienta()>10){
            if(this.urmator!=null){
                return urmator.proceseaza(candidat);
            }else{
                return true;
            }
        }else{
            System.out.println("nu are exp");
            return false;
        }
    }
}
