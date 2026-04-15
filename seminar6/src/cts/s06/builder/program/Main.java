package cts.s06.builder.program;

import cts.s06.builder.implementare.Pantof;
import cts.s06.builder.implementare.TipPantof;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pantof pantof1= Pantof.getBuilder(TipPantof.TENISI,36,10,"piele").build();
        System.out.println(pantof1);
        Pantof pantof2= Pantof.getBuilder(TipPantof.TENISI,36,10,"piele").setMaterialOptional("piele de crocodil").addMesaj("abc").build();
        System.out.println(pantof2);
        Pantof pantof3=Pantof.getBuilder(TipPantof.TENISI,36,10,"piele").setMaterialOptional("piele de crocodil").addMesaj("haide").build();
        System.out.println(pantof3);
        try{
            Pantof pantof4=Pantof.getBuilder(TipPantof.BALERIN,37,10,"piele2").addMesaj("haiidsshldjafldlhfjsahfdhdsfkjslfhdsljfdsssssssssssssssssdfdsfdsfsdfsdf").build();
        }catch( RuntimeException e){
            System.out.println("pantoful nu a putut fi comandat");
            System.out.println("motiv:"+e.getMessage());
        }
        try{
            String mesaj="";
            for(int i=0;i<100;i++){
                mesaj+="a";
            }
            Pantof pantof5=Pantof.getBuilder(TipPantof.BALERIN,37,10,"piele2").addMesaj(mesaj).build();
        }catch( RuntimeException e){
            System.out.println("pantoful nu a putut fi comandat");
            System.out.println("motiv:"+e.getMessage());
        }

        //de facut modificari in implementare astfel incat obiectul pantof sa se creeze printr o singura linie doar k
        Pantof.PantofiBuilder builder=Pantof.getBuilder(TipPantof.BALERIN,37,10,"piele232232");
        //Pantof.PantofiBuilder builder=new Pantof.PantofiBuilder(TipPantof.BALERIN,37,10,"piele2");

        Pantof pantof6=builder.setMaterialOptional("altceva").build();
        System.out.println(pantof6);

        Pantof pantof7=builder.build();
        System.out.println(pantof7);
        //vor ramane cu ramasite deci builderul nu se expune in varianta asta



    }
}