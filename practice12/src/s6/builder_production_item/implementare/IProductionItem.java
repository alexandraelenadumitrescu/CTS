package s6.builder_production_item.implementare;

public interface IProductionItem {
    String getModelName();
    String getSerialCode();
    String getMaterialType();
    String getBatchLabel();
    String getPackagingType();
    void displayInfo();
}