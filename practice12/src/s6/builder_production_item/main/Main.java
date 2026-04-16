package s6.builder_production_item.main;

import s6.builder_production_item.implementare.IProductionItem;
import s6.builder_production_item.implementare.ProductionItem;

public class Main
{
    public static void main(String[] args) {
        IProductionItem item1= ProductionItem.getBuilder("hai","hai","hai").build();
        item1.displayInfo();
        IProductionItem item2= ProductionItem.getBuilder("hai","hai","hai").setBatchLabel("iui").build();
        IProductionItem item3= ProductionItem.getBuilder("hai","hai","hai").setBatchLabel("lul").setDeliveryPriority(6).setPackagingType("op").build();
        item2.displayInfo();
        item3.displayInfo();

    }
}
