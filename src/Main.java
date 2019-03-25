import Util.Congruencial;
import Util.Math;

public class Main {
    public static void main(String [] args){


        Congruencial c = new Congruencial(1,7,12,11);

        c.addCongruencial(10,11);
        c.addCongruencial(9,13);


//        System.out.println(c.hullDobel());
//        System.out.println(c.generarNumerosLineal(10));
//        System.out.println(c.numerosNormalizados());


        System.out.println(c.lecuyer());

        System.out.println(c.congruencialMixto(5,30));
        System.out.println(c.normalizados);


    }
}
