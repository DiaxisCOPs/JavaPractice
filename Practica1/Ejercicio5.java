package Practica1;

//En este ejercicio veremos quien aprueba (>=5) o quien suspende (<5)
import java.util.Scanner;

public class Ejercicio5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame tu nota y te digo si aprobaste el examen: ");
        int nota = sc.nextInt();
        if (nota < 0|| nota > 10){
            System.out.println("Dame una nota real.");
        }
        else if (nota >= 5){
            System.out.println("Enhorabuena muchacho aprobaste.");
        }
        else{
             System.out.println("Lo siento amigo, suspendiste.");
        }
        sc.close();
    }
}