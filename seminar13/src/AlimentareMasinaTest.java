import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlimentareMasinaTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test(expected = ExceptieAlimentare.class)
    public void test1() throws ExceptieAlimentare {
        Masina m=new Masina("model",30);
        m.alimentare(100);
        fail("nu a aruncat exceptie cand trebuia");
    }
    @Test
    public void test2() throws ExceptieAlimentare {
        Masina m=new Masina("model",30);
        try{
            m.alimentare(30);
            fail();
        } catch (ExceptieAlimentare e) {
            assertTrue(true);
        }


    }

    @Test
    public void test3() throws ExceptieAlimentare {
        Masina masina=new Masina("model",50);
        masina.alimentare(20);
        assertEquals(45,masina.getNivelRezervor(),0.01);

    }

    @Test
    public void test4() throws ExceptieAlimentare {
        Masina masina=new Masina("model",50);
        double restAlimentare=masina.getCapacitateMaximaRezervor()- masina.getNivelRezervor();
        masina.alimentare(restAlimentare);
        assertEquals(masina.getNivelRezervor(),masina.getNivelRezervor(),0.01);
    }


    @After
    public void tearDown() throws Exception {
    }

}