import java.util.Scanner;
import java.util.Math;

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int n, i, T, j;
        System.out.println("Inserisci il numero di cifre da inserire in input: ");
        n = in.nextInt();
        int [] U = new int [n];
        int [] R = new int [n];
        int [] S = new int [n];
        int [] M = new int [n];
        i = 0;
        while (i<n) {
            do {
                System.out.println("Inserisci un numero positivo: ");
                U[i] = in.nextInt();
            } while (U[i]<0);
        }
        i = 0;
        while (i<n) {
            R[i] = Math.random()*11;
            System.out.println("Numero casuale compreso tra 0 e 10: " + R[i]);
            i++;
        }
        i = 0;
        while (i<n) {
            S[i] = (Math.random()*6)+3;
            System.out.println("Numero casuale compreso tra 3 e 8: " + S[i]);
            i++;
        }
        i = 0;
        while (i<n) {
            M[i] = (U[i]+R[i]+S[i])/3;
            System.out.println("Media = (" + U[i] + " + " + R[i] + " + " + S[i] + ")/3 = " + M[i]);
            i++;
        }
        System.out.println("Inserisci un numero intero: ");
        T = in.nextInt();
        i = 0;
        while (i<n) {
            j = 0;
            while (j<n) {
                if (U[i]+U[j]==T) {
                    System.out.println(U[i] + " + " + U[j] + " = " + T);
                }
                j++;
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md