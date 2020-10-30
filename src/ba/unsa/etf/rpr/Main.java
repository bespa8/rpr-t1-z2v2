package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n) {
        int suma=0;
        while (n>0) {
            int br = n%10;
            suma=suma+br;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        for (int i=1;i<=n;i++) {
            if (i%sumaCifara(i)==0) {
                System.out.println(i + " ");
            }
        }
     }
}
