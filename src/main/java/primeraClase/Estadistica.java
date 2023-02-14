package primeraClase;

import java.util.ArrayList;
import java.util.List;

public class Estadistica {



    public static float mediaAritmetica(List<Float> conjunto){
        float suma = 0;

        if (! conjunto.isEmpty()) {
            for (float numero : conjunto) {
                suma += numero;
            }

            return suma / conjunto.size();
        }
        return 0;
    }

    public static float varianza(List<Float> conjunto){
        float varianza = 0;
        float media = mediaAritmetica(conjunto);
        List<Float> nuevo = new ArrayList<>();

        for (float numero : conjunto){
            nuevo.add((float) Math.pow(numero-media,2));
        }

        media = mediaAritmetica(nuevo);

        return mediaAritmetica(nuevo);
    }

    public static float desviacion(List<Float> conjunto){
        return (float) Math.sqrt(varianza(conjunto));
    }

}
