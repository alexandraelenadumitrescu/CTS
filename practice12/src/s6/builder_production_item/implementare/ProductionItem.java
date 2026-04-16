package s6.builder_production_item.implementare;

import s5.prototype_produs.implementare.Item;

import java.util.ArrayList;
import java.util.List;

public class ProductionItem implements IProductionItem{
    private String modelName;
    private String serialName;
    private String materialType;


    private String batchLabel;
    private String packagingType;
    private String specialFinish;
    private boolean qualityCheck;
    private List<String> assemblyIntructions;
    private int deliveryPriority;

    private int noModif=0;

    private ProductionItem(String modelName, String serialName, String materialType, String batchLabel, String packagingType, String specialFinish, boolean qualityCheck, List<String> assemblyIntructions, int deliveryPriority) {
        this.modelName = modelName;
        this.serialName = serialName;
        this.materialType = materialType;
        this.batchLabel = batchLabel;
        this.packagingType = packagingType;
        this.specialFinish = specialFinish;
        this.qualityCheck = qualityCheck;
        this.assemblyIntructions = new ArrayList<>();
        this.deliveryPriority = deliveryPriority;
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }

    @Override
    public String getSerialCode() {
        return this.serialName;
    }

    @Override
    public String getMaterialType() {
        return this.materialType;
    }

    @Override
    public String getBatchLabel() {
        return this.batchLabel;
    }

    @Override
    public String getPackagingType() {
        return this.packagingType;
    }

    @Override
    public void displayInfo() {
        System.out.println("ProductionItem{" +
                "modelName='" + modelName + '\'' +
                ", serialName='" + serialName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", batchLabel='" + batchLabel + '\'' +
                ", packagingType='" + packagingType + '\'' +
                ", specialFinish='" + specialFinish + '\'' +
                ", qualityCheck=" + qualityCheck +
                ", assemblyIntructions=" + assemblyIntructions +
                ", deliveryPriority=" + deliveryPriority +
                ", noModif=" + noModif +
                '}');
    }


    //static get builder

    public static ItemBuilder getBuilder(String modelName, String serialName, String materialType){
        return new ItemBuilder(modelName,serialName,materialType);
    }

    public static class ItemBuilder implements IBuilder{
        private String modelName;
        private String serialName;
        private String materialType;

        private String batchLabel;
        private String packagingType;
        private String specialFinish;
        private boolean qualityCheck;
        private List<String> assemblyIntructions;
        private int deliveryPriority;

        private int noModif=0;

        public ItemBuilder(String modelName, String serialName, String materialType) {
            this.modelName = modelName;
            this.serialName = serialName;
            this.materialType = materialType;
        }

        public ItemBuilder setBatchLabel(String batchLabel) {
            this.batchLabel = batchLabel;
            this.noModif++;
            return this;
        }

        public ItemBuilder setPackagingType(String packagingType) {
            this.packagingType = packagingType;
            this.noModif++;
            return this;
        }

        public ItemBuilder setSpecialFinish(String specialFinish) {
            this.specialFinish = specialFinish;
            this.noModif++;
            return this;
        }

        public ItemBuilder setQualityCheck(boolean qualityCheck) {
            this.qualityCheck = qualityCheck;
            this.noModif++;
            return this;
        }

        public ItemBuilder addInstruction(String instr) {
            this.assemblyIntructions.add(instr);
            this.noModif++;
            return this;
        }

        public ItemBuilder setDeliveryPriority(int deliveryPriority) {
            this.deliveryPriority = deliveryPriority;
            this.noModif++;
            return this;
        }

        @Override
        public ProductionItem build() {
            if(this.noModif>2){
                throw new RuntimeException("prea multe modificari");
            }
            return new ProductionItem( modelName,  serialName,  materialType,  batchLabel,  packagingType,  specialFinish, qualityCheck, assemblyIntructions, deliveryPriority);
        }
    }

}
