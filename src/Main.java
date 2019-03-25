import Util.Congruencial;

public class Main {
    public static void main(String [] args){


        Congruencial c = new Congruencial(1,7,12,11);

        System.out.println(c.hullDobel());
        System.out.println(c.generarNumerosLineal(10));


    }
}
