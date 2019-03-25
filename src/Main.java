import Util.Congruencial;
import Util.Math;

public class Main {
    public static void main(String [] args){


        Congruencial c = new Congruencial(1,7,12,11);

        c.addCongruencial(25,23);
        c.addCongruencial(21,11);
        c.addCongruencial(7,14);


//        System.out.println(c.hullDobel());
//        System.out.println(c.generarNumerosLineal(10));
//        System.out.println(c.numerosNormalizados());

        System.out.println(Math.pow(10,3));

        System.out.println(c.lecuyer());

        System.out.println(c.congruencialMixto(30));
        System.out.println(c.normalizados);


    }
}
