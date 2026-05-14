package chain_candidati.implementare;

public class FiltruDisponibilitate extends AbstractFiltruCandidat{
    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.isEsteDisponibilPentruInterviu()){
            if(this.urmator!=null){
                return urmator.proceseaza(candidat);
            }else{
                return true;
            }
        }else{
            System.out.println("nu e disponibil");
            return false;
        }
    }
}
