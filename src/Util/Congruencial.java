package Util;

import java.util.ArrayList;

public class Congruencial {

    int x,a,c,m;
    int i;

    public ArrayList numerosGenerados;

    public Congruencial() {
        i = 0;
        numerosGenerados = new ArrayList();
    }

    public Congruencial(int x,int a,int c,int m) {
        this.x  = x;
        this.a  = a;
        this.c  = c;
        this.m  = m;
        i = 0;
        numerosGenerados = new ArrayList();
    }
    public Congruencial(int x,int a,int m) {
        this.x  = x;
        this.a  = a;
        this.m  = m;
        i = 0;
        numerosGenerados = new ArrayList();
    }

    public double lineal(){
        x = ((a*x)+c)%m;
        return x;
    }
    public double multiplicativo(){
        x = (a*x)%m;
        return x;
    }

    public boolean hullDobel(){
        int q =  getQ(m,a);

        if (q == 0){ return false;}

        boolean fourCheck = (m%4==0 && (a-1)%4==0);
        int qmCheck = m%q;

        int qaCheck = (a-1)%q;

//        System.out.println("qmCheck : "+qmCheck);
//        System.out.println("qaCheck : "+qaCheck);
//        System.out.println("fourCheck : "+fourCheck);

        if (Math.gcd(c,m)==1 && qmCheck==0 && qaCheck==0 && fourCheck) {
            return true;
        }
        else {
            return false;
        }
    }
    public int getQ(int m,int a) {

        for (int i = 2; i<=m ; i++){
            if (Math.isPrime(i) && (m%i == 0) && ((a - 1) % i == 0)){
                //Found q
//                System.out.println("Found q : "+i);
                return i;
            }
        }

        System.out.println("Found q : "+i);

        return 0;
    }

    public ArrayList generarNumerosLineal(int n){
        numerosGenerados = new ArrayList();
        for (int i  = 0; i<n ;i++){
            numerosGenerados.add(lineal());
        }
        return numerosGenerados;
    }

    public ArrayList generarNumerosMultiplicativo(int n){
        numerosGenerados = new ArrayList();
        for (int i  = 0; i<n ;i++){
            numerosGenerados.add(multiplicativo());
        }
        return numerosGenerados;
    }
}
