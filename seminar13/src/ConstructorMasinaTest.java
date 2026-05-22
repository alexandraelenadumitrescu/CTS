import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {
    @Test
    public void test1(){
        Masina masinaTest=new Masina("Volkswagen",30);

        assertEquals("Volkswagen",masinaTest.getModel());
        assertEquals(30,masinaTest.getCapacitateMaximaRezervor(),0.01);
        assertEquals(15,masinaTest.getNivelRezervor(),0.01);
        assertEquals(5,masinaTest.getConsumMediu(),0.01);
        assertEquals(0,masinaTest.getKilometraj());
    }

    @Test
    public void test2() {


        try {
            Masina masinaTest=new Masina("Vo",30);
            //nu
            System.out.println("aici nu");
            fail("nu arunca nicio exceptie pe input model gresit ");
        } catch (ExceptieModel e) {
            //da
            System.out.println(e.getMessage());
            System.out.println("aici da");
            assertTrue(true);
        }
        catch (ExceptieCapacitate e){
            System.out.println("nu aici");
            fail("a aruncat alta exceptie decat trebuia");
        }


    }

    @Test
    public void test3(){
        Masina masinaTest=new Masina("Volvo",30);

    }

    @Test
    public void test4(){
        Masina masinaTest=null;
        try{
            masinaTest=new Masina("Vo",30);
            fail("nu arunca exceptie pe model gresit");
        } catch (Exception e) {
            assertNull(masinaTest);
        }

    }



}