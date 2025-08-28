package Practica2;

import java.util.Scanner;
/*El programa generara un numero aleatorio entre el 1 y el 100. El usuario debe adivinar el numnero y la respuesta del programa sera
 indicar si el numero secreto es mayor o menor(Una vez dominado esto podriamos poner una serie de condiciones extra como Contar el número de intentos
 y mostrarlo al final o Validar que el usuario ingrese números dentro del rango 1–100.)
 */
public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Voy a generar un numero secreto, trata de adivinarlo. Escribe que numero crees que es: ");

        /* Esta linea lo que hace es lo primero convertir en int el resultado del parentesis de dentro. 
         * Por otra parte generamos un numero aleatorio del 0.1 al 1.0 para obtener un numero del 0 al 99 
         * Por ultimo sumamos 1 para que el numero no quede entre el 0 y el 99 y sea entre el 1 y el 100
         */
        int secret = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        int guess =sc.nextInt();
        int cont = 1;
        while(guess < 1 || guess > 100){
            System.out.println("Por favor, introduce un numero entre 1 y 100:");
            guess = sc.nextInt();
        }
            while(guess != secret){
                if(guess > secret){
                    System.out.println("El numero secreto es mas bajo");
                    guess =sc.nextInt();
                }
                
                else{
                    System.out.println("El numero secreto es mas alto");
                    guess =sc.nextInt();
                }
                while(guess < 1 || guess > 100){
                System.out.println("Por favor, introduce un numero entre 1 y 100:");
                guess = sc.nextInt();
                }
                cont++;
            }
            System.out.println("Acertaste! y solo en "+cont+" intentos!");
        sc.close();
    }
}
