package primeraClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EstadisticaTest {

    private Estadistica practica;
//    @BeforeEach
//    void init(){
//        practica = new Practica0();
//        List<Double> conjunto = new ArrayList<>();
//    }


    @Test
    @DisplayName("Test para la media")
    void mediaAritmeticaTest() {
        practica = new Estadistica();
        List<Float> conjunto = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            conjunto.add((float) i);
        }

        assertEquals(4.5, practica.mediaAritmetica(conjunto));

        List<Float> conjunto2 = new ArrayList<>();
        conjunto2.add(10F);
        assertEquals(10, practica.mediaAritmetica(conjunto2));

        List<Float> conjunto3 = new ArrayList<>();
        assertEquals(0, practica.mediaAritmetica(conjunto3));

    }

    @Test
    @DisplayName("Test para la varianza")
    void varianzaTest() {
        practica = new Estadistica();
        List<Float> conjunto = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            conjunto.add((float) i);
        }

        assertEquals(8.25, practica.varianza(conjunto),0.01);

        List<Float> conjunto2 = new ArrayList<>();
        conjunto2.add(10F);
        conjunto2.add(10F);
        assertEquals(0, practica.varianza(conjunto2));

        List<Float> conjunto3 = new ArrayList<>();
        assertEquals(0, practica.varianza(conjunto3));

    }

    @Test
    @DisplayName("Test para la desviación")
    void desviacionTest() {
        practica = new Estadistica();
        List<Float> conjunto = new ArrayList<>();
        for (int i = 0; i < 7; i++){
            conjunto.add((float) i);
        }

        assertEquals(2, practica.desviacion(conjunto));

        List<Float> conjunto2 = new ArrayList<>();
        conjunto2.add(10F);
        conjunto2.add(10F);
        assertEquals(0, practica.desviacion(conjunto2));

        List<Float> conjunto3 = new ArrayList<>();
        assertEquals(0, practica.desviacion(conjunto3));
    }
}