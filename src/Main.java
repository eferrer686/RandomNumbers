import Util.Congruencial;
import Util.Math;

public class Main {
    public static void main(String [] args){


        Congruencial c = new Congruencial(1,7,12,11);

        c.addCongruencial(40013,40014,2147483563);
        c.addCongruencial(40691,40692,2147483399);


//        System.out.println(c.hullDobel());
//        System.out.println(c.generarNumerosLineal(10));
//        System.out.println(c.numerosNormalizados());


        System.out.println(c.lecuyer());

        System.out.println(c.congruencialMixto(30));
        System.out.println(c.normalizados);


    }
}
