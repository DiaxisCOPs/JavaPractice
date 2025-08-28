package Practica2;

import java.util.Scanner;
/*En este ejercico realizare la serie de fibonacci hasta el numero de repeticiones que se nos pida por consola. */
public class Ejercicio4 {
    public static void main(String[] args){

        System.out.println("Al grano, cuantos numeros de fibonacci quieres: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int y = 1;

        System.out.print(x + ", ");
        if(n > 1){
            System.out.print(y);
        }
        for(int i= 2; i < n ; i++){

            int z = x + y;
    
            System.out.print(", "+z);
            x = y;
            y = z;
        }
        sc.close();
    }
}
