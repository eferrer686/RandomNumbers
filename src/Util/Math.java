package Util;

public class Math {
    public static int gcd(int a,int b){

        int temp = 0;

        while(b != 0){
            temp = a;
            a = b;
            b = temp%b;
        }

        return a;
    }
    public static boolean isPrime(int a){
        for(int i = 2; i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
