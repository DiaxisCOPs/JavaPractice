package Practica2;

import java.util.Scanner;
/*En este ejercicio repetire la calculadora pero creare funciones básicas para llamarlas desde main */
public class Ejercicio5 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
         // while (true){
            
            /*System.out.println("ADELANTE, PASAME UN NUMERO:");*/
            int a = sc.nextInt();
            /*System.out.println("ADELANTE, PASAME OTRO NUMERO:");*/
            int b = sc.nextInt();
            /*System.out.println("QUÉ QUIERES HACER CON ELLOS,PASAME EL SIMBOLO o PULSA X PARA SALIR: ");*/
            char simbol = sc.next().charAt(0);
            /*if (simbol == 'X' || simbol == 'x') {
                System.out.println("Apagando calculadora... BIP BIP 💀");
                break; /*rompe el bucle*/
            
            switch (simbol) {
                case '+':
                System.out.println(suma(a,b));
                break;
                case '-':
                System.out.println(resta(a,b));
                break;
                case '*':
                System.out.println(mult(a,b));
                break;
                case '/':
                System.out.println(div(a,b));
                break;
                default:
                System.out.println("Operación no valida !BIP!");
                break;
          //  }
        }
        sc.close();
        } 
    public static int suma(int a ,int b){
        return a+b;
    }
    public static int resta(int a,int b){
        return a-b;
    }
    public static int mult(int a,int b){
        return a*b;
    }
    public static double div(int a,int b){
        if(b==0){
            System.out.println("Syntex/ Error");
            return(Double.NaN);
        }
        return (double)a/b;
    }
}
