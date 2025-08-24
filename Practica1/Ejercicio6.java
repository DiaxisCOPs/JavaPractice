package Practica1;

import java.util.Scanner;

//En este ejercicio realizaré una calculadora simple usando switch
//Pediremos dos numeros y una operación
public class Ejercicio6{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Soy la calculadora, pasame primero que tipo de operación (Con simbolo) quieres realizar y a continuación los numeros: ");

        char operation = sc.next().charAt(0);

        System.out.println("Dame el primer numero: ");

        double num1 = sc.nextDouble();

        System.out.println("Dame el segundo numero: ");

        double num2 = sc.nextDouble();

        double resultado = 0;

        switch (operation) {
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
                break;
            case '/':
            if (num2==0){
                System.out.println("Error: División entre cero invalida.");
                sc.close();
                return;
            }
                resultado = num1/num2;
                break;
            default:
                System.out.println("Operación no valida.");
                sc.close();
                return;
        }
        System.out.println("Resultado BIP BIP:"+ resultado);
        sc.close();
    }

}