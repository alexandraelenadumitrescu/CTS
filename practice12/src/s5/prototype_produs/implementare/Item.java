package s5.prototype_produs.implementare;

public class Item implements Cloneable,ProductionItem{
    private String name;
    private String serialCode;
    private String batchLabel;
    private String packagingType;


    public Item(String name, String serialCode, String batchLabel, String packagingType) throws InterruptedException {
        System.out.println("incepe fabricarea produsului");
        Thread.sleep(500);
        this.name = name;
        this.serialCode = serialCode;
        this.batchLabel = batchLabel;
        this.packagingType = packagingType;
        System.out.println("s a fabricat produsul");
        System.out.println("apel ctr cons de timp");

    }


    @Override
    public String getModelName() {
        return this.name;
    }

    @Override
    public String getSerialCode() {
        return this.serialCode;
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
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    @Override
    public void displayInfo() {
        System.out.println("Item{" +
                "name='" + name + '\'' +
                ", serialCode='" + serialCode + '\'' +
                ", batchLabel='" + batchLabel + '\'' +
                ", packagingType='" + packagingType + '\'' +
                '}');
    }


}
