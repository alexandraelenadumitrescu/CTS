package s6.singleton_material.implementare;

public interface IRawMaterialControl {
    void addRawMaterial(String codAngajat, float quantity) throws Exception;
    void consumeRawMaterial(String codAngajat, String productName, float
            quantity) throws Exception;
    float getAvailableStock();
    void displayHistory();
}