package chain_candidati.implementare;

public class FiltruSalariu extends AbstractFiltruCandidat{
    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.getEsteCompatibilSalarial()){
            if(this.urmator!=null){
                return urmator.proceseaza(candidat);
            }else{
                return true;
            }
        }else{
            System.out.println("nu exista compatibilitate salariala");
            return false;
        }
    }
}
