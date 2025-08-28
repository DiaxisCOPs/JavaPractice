package Practica2;

import java.util.Scanner;

/*En este ejercicio lo que haré será pedir 1 numero  al usuario y determinar si es primo o no */
/*Un numero primero es aquel que solo es divisible entre el mismo y 1 */


public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Dame un numero y determinare si es o no primo: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cont = 0;
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }
                if(cont == 2){
                System.out.println(num + " es primo.");
            }
                else{
                System.out.println(num + " no es primo.");
                
            }
        sc.close();
    }  
    /*public static boolean Esprimo(num){

        boolean respuesta = true;

        return(respuesta);
    }
        */
}
