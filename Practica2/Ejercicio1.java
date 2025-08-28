package Practica2;

import java.util.Scanner;
/* Tabla de multiplicar, pedir un numero por consola y mostrar la tabla del 1 al 10*/
public class Ejercicio1{
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Dime de que numero quieres la tabla de multiplicar.");
            String entrada = sc.nextLine();
            if(entrada.matches("-?\\d+")){

                int number = Integer.parseInt(entrada);
                System.out.println("¿Hasta que numero quieres que haga la tabla?.");
                String entrada2 = sc.nextLine();

                /*Lo que indico en estos if es una validación de que sean solo numeros enteros tanto positivos como negativos */
                if(entrada2.matches("-?\\d+")){
                    int mult = Integer.parseInt(entrada2);
                    for(int i = 1; i<=mult; i++){
                        System.out.println(number+"x"+i+"="+(number*i));
                    }
                    break;
                }
                else{
                    System.out.println("Necesito un número real para el límite.");
                }
            }
        else{
            System.out.println("Necesito un número real para la tabla.");   
        }
            
            /*Primero voy a realizar el ejercicio para que haga la tabla del 1 al 10 */// (ya realizado)
            /*El bucle for sería suficiente para realizar esta tabla pero lo que quiero 
            es que si le paso cualquier cosa que no sea un numero me devuelva un mensaje
            y que ademas le pueda dar la opción de hasta que numero quiero realizar la tabla*/
            
            
        }
        sc.close();
    }
}