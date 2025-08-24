package Practica1;

import java.util.Scanner;

//En esta practica pedire un numero por consola y dependiendo del numero devolvere la respuesta simple; par/impar
//Practica con if/else
public class Ejercicio3 {
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Me vas a dar un numero y yo te dire si es par o impar: ");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("El "+number+" es un numero par.");
        }
        else{
            System.out.println("El "+number+" es un numero impar.");
        }
        sc.close();
    }
}
