import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CurralTest {

    @BeforeEach
    void resetEstados(){
        EstadoFactory.limpar();
    }
    @Test
    void deveRetornarTotalEstados0(){
        Curral curral = new Curral();
        assertEquals(0,EstadoFactory.obterTotalEstado());

    }
    @Test
    void deveRetornarTotalEstados1(){
        Curral curral = new Curral();
        curral.adicionar("Bezerra","Princesa","1");
        curral.adicionar("Bezerra","Sabrina","2");
        assertEquals(1,EstadoFactory.obterTotalEstado());

    }
    @Test
    void deveRetornarTotalEstados2(){
        Curral curral = new Curral();
        curral.adicionar("Bezerra","Princesa","1");
        curral.adicionar("Bezerra","Sabrina","2");
        curral.adicionar("Novilha","Malhada","3");

        assertEquals(2,EstadoFactory.obterTotalEstado());

    }
    @Test
    void deveRetornarVacas(){
        Curral curral = new Curral();
        curral.adicionar("Bezerra","Princesa","1");
        curral.adicionar("Bezerra","Sabrina","2");
        curral.adicionar("Novilha","Malhada","3");


        List<String>test = new ArrayList<String>();
        test.add("{ nome : Princesa, registro : 1, estado : Bezerra}");
        test.add("{ nome : Sabrina, registro : 2, estado : Bezerra}");
        test.add("{ nome : Malhada, registro : 3, estado : Novilha}");

        assertEquals(test,curral.obterVacas());

    }
}