package s6.singleton_material.implementare;

import s5.singleton_linie_productie.implementare.LineControl;

import java.util.ArrayList;
import java.util.List;

public class RawMaterialManager implements IRawMaterialControl{
    private float quantity=0;
    private String codAngajat;
    private List<String> operations;



    private static RawMaterialManager instance=new RawMaterialManager();

    public static RawMaterialManager getInstance(){
        return instance;
    }

    private RawMaterialManager() {
        this.operations=new ArrayList<>();
    }

    @Override
    public void addRawMaterial(String codAngajat, float quantity) throws Exception {
        if(quantity<0){
            throw new Exception("cantitate invalida de material");
        }else{
            this.quantity+=quantity;
            operations.add(codAngajat+"IN");
        }
    }

    @Override
    public void consumeRawMaterial(String codAngajat, String productName, float quantity) throws Exception {
        if(quantity<0){
            throw new Exception("cantitate invalida de material");
        }else if(this.quantity-quantity<0){
            throw new Exception("nu exista suficient material disponibil");
        }else{
            this.quantity=this.quantity-quantity;
            operations.add(codAngajat+"OUT");

        }
    }

    @Override
    public float getAvailableStock() {
        return this.quantity;
    }

    @Override
    public void displayHistory() {
        System.out.println(operations);
    }
}
