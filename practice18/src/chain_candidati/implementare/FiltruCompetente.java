package chain_candidati.implementare;

public class FiltruCompetente extends AbstractFiltruCandidat{
    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.isAreCompetente()){
            if(this.urmator!=null){
                return urmator.proceseaza(candidat);
            }else{
                return true;
            }
        }else{
            System.out.println("nu are competente");
            return false;
        }
    }
}
