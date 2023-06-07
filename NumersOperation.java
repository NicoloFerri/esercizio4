package co.develhope.introduction._4;

public class NumersOperation {
    public static void main (String[] args) {
        int a = 15;
        System.out.print(" la variabile a da " + a + " è diventata : ");
        a+=5;
        System.out.println(a);
        System.out.print(" la variabile a da " + a + " è diventata : ");
        a-=4;
        System.out.println(a);
        System.out.println("alla variabile b assegno il valore :" + a);
        int b =a;
        System.out.print("la variabile b da " + b + " è diventata : ");
        b+=1;
        System.out.println(b);


        System.out.println(" effettuo la condizione sui seguenti valori di a e b :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Mi chiedo e a = " + a+ " è un numero pari e se ");
        System.out.println("b moltiplicato per ( b+1 ) è un multiplo di 3");


if (( b % 2 != 0 ) && ( (b * (b+1)) % 3 ==0 )) {
    System.out.println("entrambi gli statement sono veri");
} else {
    System.out.println("almeno uno dei due non è verificato");
        }




    }
}
